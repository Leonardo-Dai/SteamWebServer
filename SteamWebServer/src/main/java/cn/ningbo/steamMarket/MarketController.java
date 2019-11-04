package cn.ningbo.steamMarket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MarketController {
	@RequestMapping("market.do")
	public String showMarket(){
		System.out.println("MarketController.showMarket()");
		return "market";
		
	}
}
