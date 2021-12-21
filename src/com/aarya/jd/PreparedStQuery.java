package com.aarya.jd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStQuery {

	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/arya_demo_db";
	
		String uname="root";
		String password="aarya25@";
		int id=20;
		String first_name="Aary";
		String last_name="Solank";
		String section="Math";
		String query="insert into student values(?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con=DriverManager.getConnection(url,uname,password);
		PreparedStatement st= con.prepareStatement(query);
		st.setInt(1, id);
		st.setString(2, first_name);
		st.setString(3, last_name);
		st.setString(4, section);
		
		int count=st.executeUpdate();
		System.out.println(count);
		st.close();
		con.close();
		

	}

}
