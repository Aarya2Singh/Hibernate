package com.aarya.jd;
import java.sql.*;
public class InsertValue {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/arya_demo_db";
		String uname="root";
		String password="aarya25@";
		String query="insert into  student (first_name,last_name,section) values ('Rashmi','xy','Maths')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,password);
		Statement st=con.createStatement();
		
		int count=st.executeUpdate(query);
		
		System.out.println(count + "rows affeted");
		st.close();
		con.close();
		
	}

}
