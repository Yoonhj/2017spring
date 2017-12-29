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
	
	
	@RequestMapping(value="/guest/{SABUN}", method=RequestMethod.GET) //�Խ�Ʈ���� ������ε���
	public String  detail(@PathVariable(value="SABUN") int sabun, Model model) throws Exception {//�ּҿ��� ����� �̾Ƴ�.. �ּ��ϰ� ������ ��// ������� �������ϴ� �𵨰�ü�� ����
		model.addAttribute("bean", guestService.detail(sabun));
		return"guest/detail";
	}
	
	@RequestMapping(value="/guest/{SABUN}", method=RequestMethod.PUT) //�Խ�Ʈ���� ������ε���
	public String  update(@PathVariable(value="SABUN") int sabun,  GuestVo bean) throws Exception {//�ּҿ��� ����� �̾Ƴ�.. �ּ��ϰ� ������ ��
		bean.setSabun(sabun);
		guestService.edit(bean);
		return"redirect:/guest/"+sabun;
	}
}
