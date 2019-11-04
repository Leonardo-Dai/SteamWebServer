package cn.ningbo.steamCommunity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommunityController {

	@RequestMapping("community.do")
	public String showCommunity(){
		System.out.println("CommunityController.showCommunity()");
		return "community";
	}
}
