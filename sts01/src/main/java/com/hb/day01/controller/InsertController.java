package com.hb.day01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hb.day01.model.GuestDao;

@Controller
public class InsertController {
	
	@Autowired
	GuestDao guestDao;

	@RequestMapping(value="/insert.do", method=RequestMethod.POST) //디폴트는 밸류 속성. 메소드 속성도 줄 수 있음
	public String execute(HttpServletRequest req) throws Exception {
	
		int sabun = Integer.parseInt(req.getParameter("sabun"));
		String name = req.getParameter("name");
		int pay = Integer.parseInt(req.getParameter("pay"));
		
		guestDao.insertOne(sabun, name, pay);
		return "redirect:/list.do";
		
	}
}
