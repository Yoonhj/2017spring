package com.hb.ex03.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hb.ex03.model.entity.GuestVo;

public class GuestDaoImplTest {
	GuestDao guestDao;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/Config-context.xml");
		guestDao = (GuestDao)ac.getBean("guestDao");
	}

	@Test
	public void testSelectAll() throws Exception {
	//		fail("Not yet implemented");
		List<GuestVo> list = guestDao.selectAll();
		
		assertNotNull("list�� ����", list);//list�� ���̸� ���� ����
		assertTrue("listŸ���� �ƴ�", list instanceof List); //list�� Ÿ���� ����Ʈ�� �ƴϸ� ���� ����
		assertTrue("list�� �����", list.size()>0);

//		assertNull("list�� ����", list);//list�� ���̸� ���� ����
//		assertFalse("listŸ���� �ƴ�", list instanceof List); //list�� Ÿ���� ����Ʈ�� �ƴϸ� ���� ����
//		assertFalse("list�� �����", list.size()>0);

	}

}
