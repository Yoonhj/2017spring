package com.hb.ex03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.ex03.model.GuestDao;
import com.hb.ex03.model.entity.GuestVo;
import com.hb.ex03.service.GuestService;

@Controller
public class AddController {
	//
	
	
	@Autowired
	GuestService guestService;
	
	@RequestMapping(value="/guest/add", method=RequestMethod.GET)
	public void form() {//폼 보여주는 부분 하나
		
	}
	
	@RequestMapping(value="/guest/add", method=RequestMethod.POST)
	public String add(@ModelAttribute GuestVo bean) throws Exception { //똑같은 주소로 들어오는 메서드에 따라서...get, post, delete, put에 따라 다르게
						//^자동으로 셋넴,셋페이 해주는거..
//		bean.setSabun(guestDao.nextVal()+1);
//		guestDao.insertOne(bean);
		//서비스 모듈 : 다오를 묶어주는 기능. 특정 기능들을 모아서 하나인것처럼. 컨트롤러와 다오 사이에 서비스 모듈을 두는 것
		//위를 서비스로 다 보내버림 
		
		guestService.add(bean);
		return "redirect:/guest";
	}
	
	
	
	@RequestMapping(value="/guest/{SABUN}/edit", method=RequestMethod.GET) //이 페이지는 수정 폼만 보여주는 매핑
	public String form(@PathVariable(value="SABUN") int sabun, Model model) throws Exception {//폼 보여주는 부분 
		model.addAttribute("bean", guestService.detail(sabun));
		return "guest/edit";	
	}
	
	
}
