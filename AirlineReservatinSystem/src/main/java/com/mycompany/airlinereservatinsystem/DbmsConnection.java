/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.airlinereservatinsystem;

/**
 *
 * @author ramak
 */
import java.sql.*;
public class DbmsConnection {
private final String dbmsurl = "jdbc:mysql://localhost:3306/airlinesystem";
private final String dbmsUsername = "root";
private final String dbmsPassword = "123qaz";

private Statement getStatement() {
	try {
		// connection to DBMS
		Connection connection = DriverManager.getConnection(dbmsurl,dbmsUsername,dbmsPassword);
			return connection.createStatement();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return null;
	
}
public ResultSet getQuertTable(String query) {
	try {
		Statement statement = getStatement();
			return statement.executeQuery(query);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return null;
	
}

public int updateDatabase(String query) {
	try {
		Statement statement = getStatement();
			return statement.executeUpdate(query);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return 0;
	
}  
}
