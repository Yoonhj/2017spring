package com.hb.ex02.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hb.ex02.model.entity.GuestVo;

public class GuestDaoImplTest {
	GuestDao guestDao;
	private GuestVo testBean;
	
	@Before
	public void setUp() throws Exception {
		
		ApplicationContext cntxt = new ClassPathXmlApplicationContext("/root-context.xml");
		guestDao = (GuestDao)cntxt.getBean("guestDao");
		//이게 뭐냐 testselectAll에 써먹었는데
		
		testBean = new GuestVo(9999, "test9", null, 9000);
		
		
	}

	@Test
	public void testSelectAll() throws Exception {
	//	fail("Not yet implemented");
		
		assertNotNull(guestDao);
		assertTrue(guestDao.selectAll() instanceof List); //실행결과가 리스트타입이냐
		assertTrue(guestDao.selectAll().size()>0);
		
	}

	@Test
	public void testInsertOne() throws Exception{
		int before= guestDao.selectAll().size();
		guestDao.insertOne(testBean);
		int after=guestDao.selectAll().size();
		
		assertEquals(before, after-1);
	}
	
	
	
	@Test
	public void testSelectOne() throws Exception{
		System.out.println(testBean.getSabun());
		GuestVo resultBean = guestDao.selectOne(testBean.getSabun());
		System.out.println(resultBean.getSabun());
		assertEquals(testBean, resultBean);
	}
	
	
}
