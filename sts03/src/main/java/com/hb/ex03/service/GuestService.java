package com.hb.ex03.service;

import com.hb.ex03.model.entity.GuestVo;

public interface GuestService {
	void add(GuestVo bean) throws Exception;
	GuestVo detail(int sabun) throws Exception;
	int edit(GuestVo bean) throws Exception;
	
}
