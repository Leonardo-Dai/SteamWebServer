package cn.ningbo.steamUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("reg.do")
	public String showReg(){
		System.out.println("UserController.showReg()");
		return "reg";
	}
	
	@RequestMapping("login.do")
	public String showLogin(){
		System.out.println("UserController.showLogin()");
		return "login";
	}
}
