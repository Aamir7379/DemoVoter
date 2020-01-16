package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Bean.Bean;
import com.connection.DbConnection;

public class Dao {
public int Insert(Bean bean) {
	int insert=0;
	try {
		Connection con=null;
		con=DbConnection.get_Connection();
		PreparedStatement ps=con.prepareStatement("insert into registration value(?,?,?,?,?)");
		ps.setString(1,bean.getName());
		ps.setString(2,bean.getEmail());
		ps.setString(3,bean.getMobile());
		ps.setString(4,bean.getPassword());
		ps.setString(5,bean.getConfirm_password());
		insert = ps.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return insert;
}
public Bean checkLoginUser(Bean bean) {

	try {
		Connection con = null;
		con =DbConnection.get_Connection();
		PreparedStatement ps = con.prepareStatement("select * from registration where name=? and password=?");
		ps.setString(1, bean.getName());
		ps.setString(2, bean.getPassword());

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			ps.setString(1,bean.getName());
			ps.setString(2,bean.getEmail());
			ps.setString(3,bean.getMobile());
			ps.setString(4,bean.getPassword());
			ps.setString(5,bean.getConfirm_password());
		} else {
			bean = null;
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
	return bean;
}
}
