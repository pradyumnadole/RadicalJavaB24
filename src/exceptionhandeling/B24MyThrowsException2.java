package exceptionhandeling;

import java.io.IOException;
import java.sql.SQLException;

public class B24MyThrowsException2 {
	
	static void method () throws IOException,SQLException {
		method1();
		throw new IOException("in method");	
	}
	
	static void method1 () throws SQLException {
		System.out.println("in method 1");
		throw new SQLException("sql exception");
	}
	
	public static void main(String[] args) {
		//method(); if we simply method we need to add throws at main method
		//multiple catch is possible but only one get executed
		try {
			method();
		} catch (SQLException e) {
			System.out.println("in sql exception");
			
		} catch(IOException obj) {
			System.out.println("in IO exception");
		}
		System.out.println("Regular code");
		
		
		
	}
	

}
