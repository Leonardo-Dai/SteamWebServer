package cn.ningbo.steamSearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {	
	
	@RequestMapping("search.do")
	public String showSearch(){
		System.out.println("SearchController.showSearch()");
		return "search";
		
	}
}
