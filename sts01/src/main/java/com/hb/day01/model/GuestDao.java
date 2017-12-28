package com.hb.day01.model;

import java.util.List;

import com.hb.day01.model.entity.GuestVo;

public interface GuestDao {
	
	public List<GuestVo> selectAll() throws Exception;
	public void insertOne(int sabun, String name, int pay) throws Exception;
	public GuestVo selectOne(int sabun) throws Exception;
	public int updateOne(int sabun, String name, int pay) throws Exception;
	
	
}
