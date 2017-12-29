package com.hb.ex03.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hb.ex03.model.GuestDao;
import com.hb.ex03.model.entity.GuestVo;

public class GuestServiceImpl implements GuestService {
	//@Autowired
	GuestDao guestDao;
	
	public GuestServiceImpl(GuestDao guestDao) {
	//오토와이어드//세터도 되지만 생성자를 통한 주입
		this.guestDao=guestDao;
	}
	
	@Override
	public void add(GuestVo bean) throws Exception {
		
		bean.setSabun(guestDao.nextVal()+1);
		guestDao.insertOne(bean);

	}

	@Override
	public GuestVo detail(int sabun) throws Exception {
		
		return guestDao.selectOne(sabun);
	}

	@Override
	public int edit(GuestVo bean) throws Exception {
		
		return guestDao.updateOne(bean);
	}

}
