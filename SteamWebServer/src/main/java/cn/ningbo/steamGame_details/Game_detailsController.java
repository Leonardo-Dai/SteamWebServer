package cn.ningbo.steamGame_details;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Game_detailsController {
	
	@RequestMapping("game_details.do")
	public String showGame_details(){
		System.out.println("Game_detailsController.showGame_details()");
		return "Game_details";
		
	}
}
