package com.hb.ex02;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hb.ex02.model.GuestDao;
import com.hb.ex02.model.entity.GuestVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired //주입받고
	GuestDao guestDao;
	
	@RequestMapping("/")
	public String list(Model model) throws Exception { //모델 하나 받아서 애드 어트리뷰트
		model.addAttribute("list", guestDao.selectAll());
		
		return "home";
	}
		
	
	//add는 새 컨트롤러가 아니라 메소드를 !
	@RequestMapping("/add")//주소를 통해 add를 리턴. 확장명이 없는게 더 유리  //메소드 명과 주소는 달라도 노상관
	public void addMethod() {
		//이거 아무 기능도 없이 매핑만 함ㅋㅋㅋㅋㅋㅋ
	}
	
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insert(@ModelAttribute GuestVo bean) throws Exception {
		
		
		guestDao.insertOne(bean);
		return "redirect://"; //홈으로 돌아감
	}
	
	
	@RequestMapping("/detail")
	public void detail(@RequestParam("idx") int sabun, Model model) throws Exception {
		
		model.addAttribute("bean", guestDao.selectOne(sabun));
		
	}
	
	
}
