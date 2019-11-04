package cn.ningbo.steamNews;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {
	@RequestMapping("news.do")
	public String showNews(){
		System.out.println("NewsController.showNews()");
		return "news";
	}
}
