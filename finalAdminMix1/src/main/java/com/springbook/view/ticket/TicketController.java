package com.springbook.view.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.ticket.TicketService;
import com.springbook.biz.ticket.TicketVO;

@Controller
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
	@RequestMapping("getTicketList.do")
	public String getTicketList(TicketVO vo,Model model) {
		if(vo.getSearchKeyword()==null)vo.setSearchKeyword("");
		
		model.addAttribute("ticketList",ticketService.getTicketList(vo));
		return "getTicketList.jsp";
	}
}