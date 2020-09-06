package com.springbook.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index.do")
	public String indexView() {
		System.out.println("Move to indexView()...");
		
		return "index.jsp";
	}
	
	@RequestMapping("/charts.do")
	public String chartsView() {
		System.out.println("Move to chartsView()...");
		
		return "charts.jsp";
	}
}