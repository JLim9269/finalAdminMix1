package com.springbook.biz.admin.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.admin.AdminVO;

@Repository("adminDAO")
public class AdminDAOMybatis {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public AdminVO getAdmin(AdminVO vo) {
		System.out.println("===> Mybatis로 AdminDAO.getAdmin 기능 처리");
		return mybatis.selectOne("AdminDAO.getAdmin",vo);
	}
	
	public void register(AdminVO vo) {
		System.out.println("===> Mybatis로 AdminDAO.register 기능 처리");
		mybatis.insert("AdminDAO.register",vo);
	}
}