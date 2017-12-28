package com.hb.day01.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.hb.day01.model.entity.GuestVo;

public class GuestDaoImpl implements GuestDao {

	//@Autowired//????
	DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public List<GuestVo> selectAll() throws Exception {
		String sql = "SELECT * FROM GUEST03";
		
		List<GuestVo> list = new ArrayList<GuestVo>();
		
//		String driver="org.gjt.mm.mysql.Driver"; //mysql 5점대부터는 드라이버 패키지 변경
//		//이렇게 패키지가 변경되니까 라이브러리 들여다보는 습관들이래
//		String url="jdbc:mysql://localhost:3306/xe?useUnicode=true&characterEncoding=utf8";
//		//이 부분도 나중에 프로퍼티로 들어가게 되면 뒤에 인코딩 들어간대
//		String user="scott";
//		String pw="tiger";
//		Class.forName(driver);
		
		try(Connection conn = dataSource.getConnection()){//DriverManager.getConnection(url, user, pw)){ //커넥션은 java sql임
			//여기서 java 1.7이상으로 바꾸라고 오류남 pom의 1.6인 자바들을 1.7로 바꿀것
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				list.add(new GuestVo(
								rs.getInt("sabun"),
								rs.getString("name"),
								rs.getTimestamp("nalzza"),
								rs.getInt("pay")
						));
			}
			
		}
		return list;
	}

	
	
	@Override
	public void insertOne(int sabun, String name, int pay) throws Exception {
		String sql="INSERT INTO GUEST03 VALUES (?,?,NOW(),?)";
		
		try (Connection conn =dataSource.getConnection()){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			pstmt.setString(2, name);
			pstmt.setInt(3, pay);
			
			pstmt.executeUpdate();
		}
		
	}

	
	
	@Override
	public GuestVo selectOne(int sabun) throws Exception {
		
		String sql = "SELECT * FROM GUEST03 WHERE SABUN=?";

		GuestVo bean =null;
	
		try(Connection conn = dataSource.getConnection()){//DriverManager.getConnection(url, user, pw)){ //커넥션은 java sql임
			//여기서 java 1.7이상으로 바꾸라고 오류남 pom의 1.6인 자바들을 1.7로 바꿀것
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				bean = new GuestVo(
								rs.getInt("sabun"),
								rs.getString("name"),
								rs.getTimestamp("nalzza"),
								rs.getInt("pay")
						);
			}
			
		}
		
		return bean;
	}



	@Override
	public int updateOne(int sabun, String name, int pay) throws Exception {
		String sql="UPDATE GUEST03 SET NAME=?, PAY=? WHERE SABUN=?";
		
		try (Connection conn =dataSource.getConnection()){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setInt(2, pay);
			pstmt.setInt(3, sabun);
			
			System.out.println(name+pay+sabun);
			return pstmt.executeUpdate();
		}
		
	}

}
