package com.hb.ex03.model;

import java.util.List;

import com.hb.ex03.model.entity.GuestVo;

public interface GuestDao {

	
	List<GuestVo> selectAll() throws Exception;
	
}
