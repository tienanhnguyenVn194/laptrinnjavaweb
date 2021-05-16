package com.laptrinhjavaweb.respository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.laptrinhjavaweb.entity.BuildingEntity;

public class BuildingRepository implements IBuildingRepository {
	private String JDBC_DRIVE = "com.mysql.jdbc.Driver";
	private String DB_URL = "jdbc:mysql://localhost:3306/estatebasic";
	
	private String USER = "root";
	private String PASS = "1234567890";
	public ArrayList<BuildingEntity> findALl() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<BuildingEntity> result = new ArrayList<BuildingEntity>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();
			String sql = "select * from bulding";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				BuildingEntity buildingEntity = new BuildingEntity();
				buildingEntity.setName(rs.getString("name"));
				buildingEntity.setNumberOfBasement(rs.getInt("numberofbasement"));
				result.add(buildingEntity);
			}
			return result;
			
		}catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (conn != null)
					stmt.close();
				if (conn != null)
					rs.close();
			} catch (SQLException se) {
				System.out.print("Loi 2");
			}
		}
		return null;
	}
}
