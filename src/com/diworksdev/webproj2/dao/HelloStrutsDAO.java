package com.diworksdev.webproj2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.diworksdev.webproj2.util.DBConnector;

public class HelloStrutsDAO {
	
	public boolean select() {
		boolean ret=false;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "select * from users";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ret=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

}
