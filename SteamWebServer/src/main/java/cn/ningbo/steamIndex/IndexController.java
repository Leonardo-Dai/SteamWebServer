package cn.ningbo.steamIndex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("index.do")
	public String showIndex(){
		System.out.println("IndexController.showIndex()");
		return "index";
		
	}
	
}
