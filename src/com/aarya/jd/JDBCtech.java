package com.aarya.jd;
import java.sql.*;
public class JDBCtech {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3307/arya_demo_db";
		String uname="root";
		String password="aarya25@";
		String query="SELECT first_name FROM student WHERE id=4";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		String name=rs.getString("first_name");
		System.out.println(name);
		st.close();
		con.close();
		
	}

}
