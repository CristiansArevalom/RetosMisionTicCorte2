package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private static final String UBICACION_BD="ProyectosConstruccion.db";
//usando SQlLite
	public static Connection getConnection() {
		String url = "jdbc:sqlite:" + UBICACION_BD;
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
			if(conn !=null) {
				//System.out.println("Conexión exitosa");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return conn;
		
	}
	/*
	public static void main(String []args) {
		ConnectionDB.getConnection();
	}*/
	
}
