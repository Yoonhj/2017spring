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
	//기존엔 상속을 받았는데 지금부터는 pojo로 간다고...! 아무런 상속이 없음!
	//근데 어떻게 컨트롤러로 만드느냐... 어노테이션!
	
	@Autowired//어노테이션을 필드에 붙이면 세터없어도 자동으로 생성해서 씀
	GuestDao guestDao;
	
//	@Autowired //이 어노테이션으로 주입받음
//	public void setGuestDao(GuestDao guestDao) { //세터로 주입하려면 빈이 필요...  rootcontext로 가서 빈 만들어야
//		this.guestDao = guestDao;
//	}
	//루트 컨텍스트의 빈에서 다오객체 만들고 > 컨트롤러에서 타입이 일치하는 빈이 있으면 만들고 컨트롤러의 필드명과 일치하는지 확인한후 오토와이어드가 붙은 필드가 있으면 세터 생성해서 주입 
	
	@RequestMapping("/list.do") //기존에 xml에서 하던 빈을 만들고 컨트롤러/url 매핑을 어노테이션으로
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		//여기선 빈을 통해 다오를 주입받아서 mav.addObject("list", guestDao.selectAll()); 해줘야하는데?!! 빈이 이미 빠져있음
		mav.addObject("list", guestDao.selectAll());
		
		
		mav.setViewName("list");
		
		
		return mav;
	}
	
	
}
