package com.hb.ex03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.ex03.model.entity.GuestVo;
import com.hb.ex03.service.GuestService;

@Controller
public class UpdateController {
	@Autowired
	GuestService guestService;
	
	
	@RequestMapping(value="/guest/{SABUN}", method=RequestMethod.GET) //게스트이하 사번이인덱스
	public String  detail(@PathVariable(value="SABUN") int sabun, Model model) throws Exception {//주소에서 사번을 뽑아냄.. 주소하고만 같으면 됨// 결과값을 보내야하니 모델객체를 만듬
		model.addAttribute("bean", guestService.detail(sabun));
		return"guest/detail";
	}
	
	@RequestMapping(value="/guest/{SABUN}", method=RequestMethod.PUT) //게스트이하 사번이인덱스
	public String  update(@PathVariable(value="SABUN") int sabun,  GuestVo bean) throws Exception {//주소에서 사번을 뽑아냄.. 주소하고만 같으면 됨
		bean.setSabun(sabun);
		guestService.edit(bean);
		return"redirect:/guest/"+sabun;
	}
}
