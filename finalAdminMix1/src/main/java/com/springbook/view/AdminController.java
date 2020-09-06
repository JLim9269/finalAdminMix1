package com.springbook.view;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.admin.AdminService;
import com.springbook.biz.admin.AdminVO;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="login.do",method=RequestMethod.POST)
	public String login(AdminVO vo,HttpSession session) {
		if(vo.getEmail()==null||vo.getEmail().equals("")) {
			throw new IllegalArgumentException("Must write your Email");
		}
		
		AdminVO admin = adminService.getAdmin(vo);
		if(admin!=null) {
			session.setAttribute("adminEmail",admin.getEmail());
			return "index.jsp";
		}else {
			return "login.jsp";
		}
	}
	
	@RequestMapping(value="register.do",method=RequestMethod.POST)
	public String register(AdminVO vo) {
		adminService.register(vo);
		return "login.jsp";
	}
}