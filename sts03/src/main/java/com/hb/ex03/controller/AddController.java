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
	public void form() {//�� �����ִ� �κ� �ϳ�
		
	}
	
	@RequestMapping(value="/guest/add", method=RequestMethod.POST)
	public String add(@ModelAttribute GuestVo bean) throws Exception { //�Ȱ��� �ּҷ� ������ �޼��忡 ����...get, post, delete, put�� ���� �ٸ���
						//^�ڵ����� �³�,������ ���ִ°�..
//		bean.setSabun(guestDao.nextVal()+1);
//		guestDao.insertOne(bean);
		//���� ��� : �ٿ��� �����ִ� ���. Ư�� ��ɵ��� ��Ƽ� �ϳ��ΰ�ó��. ��Ʈ�ѷ��� �ٿ� ���̿� ���� ����� �δ� ��
		//���� ���񽺷� �� �������� 
		
		guestService.add(bean);
		return "redirect:/guest";
	}
	
	
	
	@RequestMapping(value="/guest/{SABUN}/edit", method=RequestMethod.GET) //�� �������� ���� ���� �����ִ� ����
	public String form(@PathVariable(value="SABUN") int sabun, Model model) throws Exception {//�� �����ִ� �κ� 
		model.addAttribute("bean", guestService.detail(sabun));
		return "guest/edit";	
	}
	
	
}
