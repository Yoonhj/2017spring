package com.hb.ex03.model;

import java.util.List;

import com.hb.ex03.model.entity.GuestVo;

public interface GuestDao {

	
	List<GuestVo> selectAll() throws Exception;
	void insertOne(GuestVo bean) throws Exception;
	int nextVal() throws Exception;
	GuestVo selectOne(int sabun) throws Exception;
	int updateOne(GuestVo bean) throws Exception;
	
	
}
