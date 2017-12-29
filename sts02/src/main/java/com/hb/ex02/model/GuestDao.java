package com.hb.ex02.model;

import java.util.List;

import com.hb.ex02.model.entity.GuestVo;

public interface GuestDao {
	
	List<GuestVo> selectAll() throws Exception;
	void insertOne(GuestVo bean) throws Exception;
	GuestVo selectOne(int sabun) throws Exception;
	
}
