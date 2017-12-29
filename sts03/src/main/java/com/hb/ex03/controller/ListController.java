package com.hb.ex03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hb.ex03.model.GuestDao;

@Controller
public class ListController {
	
	@Autowired
	GuestDao guestDao; 
	
	@RequestMapping("/guest") //목록은 겟방식
	public void listPage(Model model) throws Exception { //
			model.addAttribute("list", guestDao.selectAll());
	}
	
	
}
