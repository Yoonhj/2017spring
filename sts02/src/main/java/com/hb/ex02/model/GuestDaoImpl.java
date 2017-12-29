package com.hb.ex02.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hb.ex02.model.entity.GuestVo;

public class GuestDaoImpl implements GuestDao {
	
	JdbcTemplate jdbcTemplate;
	RowMapper<GuestVo> rowMapper = new RowMapper() { //select문 일때?
		//리턴이 익스큐트쿼리 할때가 문제니까 
		
		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new GuestVo(
					rs.getInt("sabun"), rs.getString("name"), rs.getDate("nalzza"), rs.getInt("pay")
					);
		};
	};
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<GuestVo> selectAll() throws Exception{ //익셉션 있음 오류나는데
		String sql = "SELECT * FROM GUEST03";
		
		//return jdbcTemplate.queryForList(sql, GuestVo.class); //두번째 인자는 리스트에 담을 타입
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void insertOne(GuestVo bean) throws Exception {
		String sql ="INSERT INTO GUEST03 VALUES (?, ?, NOW(), ?)";
		
		//Object[] objs = new Object[]{bean.getSabun(), bean.getName(), bean.getPay()};
		jdbcTemplate.update(sql, bean.getSabun(), bean.getName(), bean.getPay()); //물음표 순서대로
				
				
		
	}

	@Override
	public GuestVo selectOne(int sabun) throws Exception {
		String sql ="SELECT * FROM GUEST03 WHERE SABUN=?";
		return (GuestVo)jdbcTemplate.queryForObject(sql, rowMapper, sabun);
		
	}

}
