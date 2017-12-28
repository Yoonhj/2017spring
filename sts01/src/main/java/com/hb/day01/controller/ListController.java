package com.hb.day01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hb.day01.model.GuestDao;

@Controller
public class ListController {
	//������ ����� �޾Ҵµ� ���ݺ��ʹ� pojo�� ���ٰ�...! �ƹ��� ����� ����!
	//�ٵ� ��� ��Ʈ�ѷ��� �������... ������̼�!
	
	@Autowired//������̼��� �ʵ忡 ���̸� ���;�� �ڵ����� �����ؼ� ��
	GuestDao guestDao;
	
//	@Autowired //�� ������̼����� ���Թ���
//	public void setGuestDao(GuestDao guestDao) { //���ͷ� �����Ϸ��� ���� �ʿ�...  rootcontext�� ���� �� ������
//		this.guestDao = guestDao;
//	}
	//��Ʈ ���ؽ�Ʈ�� �󿡼� �ٿ���ü ����� > ��Ʈ�ѷ����� Ÿ���� ��ġ�ϴ� ���� ������ ����� ��Ʈ�ѷ��� �ʵ��� ��ġ�ϴ��� Ȯ������ ������̾�尡 ���� �ʵ尡 ������ ���� �����ؼ� ���� 
	
	@RequestMapping("/list.do") //������ xml���� �ϴ� ���� ����� ��Ʈ�ѷ�/url ������ ������̼�����
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		//���⼱ ���� ���� �ٿ��� ���Թ޾Ƽ� mav.addObject("list", guestDao.selectAll()); ������ϴµ�?!! ���� �̹� ��������
		mav.addObject("list", guestDao.selectAll());
		
		
		mav.setViewName("list");
		
		
		return mav;
	}
	
	
}
