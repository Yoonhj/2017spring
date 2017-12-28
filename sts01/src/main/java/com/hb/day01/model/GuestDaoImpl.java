package com.hb.day01.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hb.day01.model.entity.GuestVo;

public class GuestDaoImpl implements GuestDao {

	@Override
	public List<GuestVo> selectAll() throws Exception {
		String sql = "SELECT * FROM GUEST03";
		
		List<GuestVo> list = new ArrayList<GuestVo>();
		
		String driver="org.gjt.mm.mysql.Driver"; //mysql 5������ʹ� ����̹� ��Ű�� ����
		//�̷��� ��Ű���� ����Ǵϱ� ���̺귯�� �鿩�ٺ��� �������̷�
		String url="jdbc:mysql://localhost:3306/xe?useUnicode=true&characterEncoding=utf8";
		//�� �κе� ���߿� ������Ƽ�� ���� �Ǹ� �ڿ� ���ڵ� ����
		String user="scott";
		String pw="tiger";
		
		Class.forName(driver);
		
		try(Connection conn = DriverManager.getConnection(url, user, pw)){ //Ŀ�ؼ��� java sql��
			//���⼭ java 1.7�̻����� �ٲٶ�� ������ pom�� 1.6�� �ڹٵ��� 1.7�� �ٲܰ�
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

}
