package com.springbook.biz.admin.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.admin.AdminService;
import com.springbook.biz.admin.AdminVO;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDAOMybatis adminDAO;
	
	@Override
	public AdminVO getAdmin(AdminVO vo) {
		return adminDAO.getAdmin(vo);
	}
	
	@Override
	public void register(AdminVO vo) {
		adminDAO.register(vo);
	}
}