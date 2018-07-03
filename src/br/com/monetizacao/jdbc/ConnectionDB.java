package br.com.monetizacao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

	private static String url = "JDBC:mysql://localhost:3306/monetizacao";
	private static String user = "root";
	private static String password = "root";
	private static Connection connection;

	public static Connection getConexao() throws SQLException{
		
		try {
			if(connection == null) {
				connection = DriverManager.getConnection(url, user, password);
			}	
			return connection;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
		
	}
	
		
		
	

}
