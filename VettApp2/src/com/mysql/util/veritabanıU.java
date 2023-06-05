package com.mysql.util;
import java.sql.*;


public class veritabanıU {
static Connection conn=null;

public static Connection Baglan() {
	
	try {
		//jdbc:
		conn=DriverManager.getConnection("jdbc:mysql://localhost/vetapp002","root","mysql");
		return conn;
	} catch (Exception e) {
		
		// TODO: handle exception
System.out.println("bad hata");
		return null;
	}
}



}
