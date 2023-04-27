package controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.TotalService;
import util.Common;
import vo.UserVO;

@Controller
public class UserController {
	// test
	// test입니다!!!!!!
	// develop2

	@Autowired
	HttpServletRequest request;

	@Autowired
	ServletContext app;

	private TotalService service;

	@Autowired
	public UserController(TotalService service) {
		this.service = service;
		System.out.println("Controller 생성자 : " + service);
	} // end of constructor
	
	@RequestMapping("/")
	public String mainofmain(){
		return Common.Main.VIEW_PATH+"main_of_main.jsp";
	}

<<<<<<< HEAD
	@RequestMapping( "/user_list.do" )
	public String selectList(Model model) {
		List<UserVO> user_list = service.selectList();
		model.addAttribute("user_list", user_list);

		return Common.User.VIEW_PATH + "user_list.jsp";
	} // end of selectList()

	@RequestMapping("/main.do")
	public String main(){
		return Common.Main.VIEW_PATH + "main.jsp";
	} // end of main()

	@RequestMapping("/login.do")
	public String login(){
		return Common.Main.VIEW_PATH + "pages-login.jsp";
	}

} // end of class
