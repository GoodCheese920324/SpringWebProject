package controller;

import com.github.scribejava.core.model.OAuth2AccessToken;
import kakaologin.KakaoLoginBO;
import naverlogin.NaverLoginBO;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.TotalService;
import util.Common;
import vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController {

    @Autowired
    private HttpServletRequest request;

    private HttpSession session;

    private TotalService service;

    private NaverLoginBO naverLoginBO;
    private String apiResult = null;

    private KakaoLoginBO kakaoLoginBO;

    @Autowired
    public LoginController(TotalService service, NaverLoginBO naverLoginBO, KakaoLoginBO kakaoLoginBO, HttpSession session) {
        this.session = session;
        this.service = service;
        this.naverLoginBO = naverLoginBO;
        this.kakaoLoginBO = kakaoLoginBO;
        System.out.println("naverLoginBO 객체 : " + naverLoginBO);
        System.out.println("kakaoLoginBO 객체 : " + kakaoLoginBO);
    } // end of constructor

    @RequestMapping(value = "/login.do", method = {RequestMethod.GET, RequestMethod.POST})
    public String login(Model model, String check) {
        // session = request.getSession();

        /* 네이버아이디로 인증 URL을 생성하기 위하여 naverLoginBO클래스의 getAuthorizationUrl메소드 호출 */
        String naverAuthUrl = naverLoginBO.getAuthorizationUrl(session);

        //https://nid.naver.com/oauth2.0/authorize?response_type=code&client_id=sE***************&
        //redirect_uri=192.168.3.3%3A8090%2Flogin_project%2Fcallback&state=e68c269c-5ba9-4c31-85da-54c16c658125
        System.out.println("네이버 : " + naverAuthUrl);

        // 네이버
        model.addAttribute("naverUrl", naverAuthUrl);
        // 카카오 URL
        String kakaoAuthUrl = kakaoLoginBO.getAuthorizationUrl(session);
        System.out.println("카카오 : " + kakaoAuthUrl);
        model.addAttribute("kakaoUrl", kakaoAuthUrl);

        model.addAttribute("check",check);

        return Common.Login.VIEW_PATH + "login.jsp";
    } // end of login()

    @RequestMapping(value = "/callback.do", method = {RequestMethod.GET, RequestMethod.POST})
    public String naverCallback(Model model, @RequestParam String code, @RequestParam String state) throws Exception {
        System.out.println("naver callBack 실행됨");
        // System.out.println(code);
        // System.out.println(state);
        OAuth2AccessToken oauthToken;
        oauthToken = naverLoginBO.getAccessToken(session, code, state);
        // 로그인 사용자 정보를 읽어온다.
        apiResult = naverLoginBO.getUserProfile(oauthToken);

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObj;

        jsonObj = (JSONObject) jsonParser.parse(apiResult);
        JSONObject response_obj = (JSONObject) jsonObj.get("response");

        // 프로필 조회
        String email = (String) response_obj.get("email");
        String name = (String) response_obj.get("name");
        String birthday = (String) response_obj.get("birthday");
        String birthyear = (String) response_obj.get("birthyear");

        String birthdate = birthyear + birthday.substring(0, 2) + birthday.substring(3,5);

        // 세션에 사용자 정보 등록
        model.addAttribute("signIn", apiResult);
        model.addAttribute("email", email);
        model.addAttribute("name", name);
        model.addAttribute("birthdate", birthdate);

        return "redirect:/naver_register_form.do";
    } // end of callback()

    @RequestMapping(value = "/kakaoCallback.do", method = {RequestMethod.GET, RequestMethod.POST})
    public String kakaoCallback(Model model, @RequestParam String code, @RequestParam String state) throws Exception {
        System.out.println("kakao callback 실행 됨");
        OAuth2AccessToken oAuth2AccessToken;
        oAuth2AccessToken = kakaoLoginBO.getAccessToken(session, code, state);

        // 로그인 사용자 정보를 읽어옴
        apiResult = kakaoLoginBO.getUserProfile(oAuth2AccessToken);

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObj;

        jsonObj = (JSONObject) jsonParser.parse(apiResult);
        JSONObject response_obj1 = (JSONObject) jsonObj.get("kakao_account");
        JSONObject response_obj2 = (JSONObject) response_obj1.get("profile");

        // 프로필 조회
        String email = (String) response_obj1.get("email");
        String name = (String) response_obj2.get("nickname");
        System.out.println(email);
        System.out.println(name);

        // 세션에 사용자 정보 등록
        model.addAttribute("signIn", apiResult);
        model.addAttribute("email", email);
        model.addAttribute("name", name);

        return "redirct:/naver_register_form.do";
    } // end of kakaocallback()

    @RequestMapping("/naver_register_form.do")
    public String naver_register_form(Model model, String name, String email, String birthdate) {
        // 네이버  로그인 정보 받아옴
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("birthdate", birthdate);

        return Common.Login.VIEW_PATH + "register_form.jsp";
    } // end of register()

    @RequestMapping("/register_form.do")
    public String register_form(Model model) {
        // 네이버  로그인 정보 받아옴

        return Common.Login.VIEW_PATH + "register_form.jsp";
    } // end of register()

    @RequestMapping("/register_detail_form.do")
    public String register_detail_form(Model model, UserVO vo) {
        model.addAttribute("vo", vo);
        return Common.Login.VIEW_PATH + "register_detail.jsp";
    } // end of register_detail()

    @RequestMapping("/register.do")
    public String register(Model model, UserVO vo) {
        int res = service.insert(vo);
        System.out.println(res);
        int check = 0;
        // 회원가입 성공, 실패, 첫 로드 확인
        if (res == 1) {
            check = 1;
        } else {
            check = 2;
        }
        model.addAttribute("check", check);
        return Common.Login.VIEW_PATH + "login.jsp";
    } // end of register()

    @RequestMapping(value = "/user_login.do", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String user_login(UserVO vo){
        String user_email = vo.getUser_email();
        String user_pwd = vo.getUser_pwd();
        
        String result = "";
        UserVO vo1 = service.selectOne(user_email);
        if(vo1 == null){
            result = "로그인 실패";
        } else if(!vo1.getUser_pwd().equals(user_pwd)){
            result = "비밀번호 불일치";
        } else{
            result = "로그인 성공";
        }

        return result;
    } // end of user_login()



} // end of class
