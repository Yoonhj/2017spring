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
		
		assertNotNull("list가 널임", list);//list가 널이면 앞의 구문
		assertTrue("list타입이 아님", list instanceof List); //list의 타입이 리스트가 아니면 앞의 구문
		assertTrue("list가 비었음", list.size()>0);

//		assertNull("list가 널임", list);//list가 널이면 앞의 구문
//		assertFalse("list타입이 아님", list instanceof List); //list의 타입이 리스트가 아니면 앞의 구문
//		assertFalse("list가 비었음", list.size()>0);

	}

}
