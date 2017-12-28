package com.hb.day01.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hb.day01.model.GuestDao;
import com.hb.day01.model.entity.GuestVo;

@Controller
public class DetailController {

	@Autowired
	GuestDao guestDao;
	
	@RequestMapping("/detail.do")
	public String detail(@RequestParam("idx") int sabun, HttpServletRequest req) throws Exception { //execute말고 아무이름이나
						//리퀘스트파람을 받아서 int sabun에 대입해줌
		GuestVo bean = guestDao.selectOne(sabun);
		req.setAttribute("bean", bean);
		return "detail";
	}
	
	
}
