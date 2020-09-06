package com.springbook.biz.ticket.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.ticket.TicketVO;

@Repository("ticketDAO")
public class TicketDAOMybatis {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<TicketVO> getTicketList(TicketVO vo){
		System.out.println("===> Mybatis로 TicketDAO.getTicketList 기능 처리");
		return mybatis.selectList("TicketDAO.getTicketList",vo);
	}
}