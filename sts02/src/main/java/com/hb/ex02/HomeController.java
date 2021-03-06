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
	
	@Autowired //爽脊閤壱
	GuestDao guestDao;
	
	@RequestMapping("/")
	public String list(Model model) throws Exception { //乞季 馬蟹 閤焼辞 蕉球 嬢闘軒坂闘
		model.addAttribute("list", guestDao.selectAll());
		
		return "home";
	}
		
	
	//add澗 歯 珍闘継君亜 焼艦虞 五社球研 !
	@RequestMapping("/add")//爽社研 搭背 add研 軒渡. 溌舌誤戚 蒸澗惟 希 政軒  //五社球 誤引 爽社澗 含虞亀 葛雌淫
	public void addMethod() {
		//戚暗 焼巷 奄管亀 蒸戚 古芭幻 敗せせせせせせ
	}
	
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insert(@ModelAttribute GuestVo bean) throws Exception {
		
		
		guestDao.insertOne(bean);
		return "redirect://"; //幡生稽 宜焼姶
	}
	
	
	@RequestMapping("/detail")
	public void detail(@RequestParam("idx") int sabun, Model model) throws Exception {
		
		model.addAttribute("bean", guestDao.selectOne(sabun));
		
	}
	
	
}
