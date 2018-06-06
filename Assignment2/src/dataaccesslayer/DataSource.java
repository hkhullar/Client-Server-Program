/* File: DataSource.java
 * Author: Himanshu Khullar & Chirag Kachariya
 * Date: November, 2017
 * Description:This class  will connect the program to the database
 * Professor Stanley Pieda
 */


package dataaccesslayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
	private Connection con = null;                                                         //Initializing Connection object
	private final String connectionString = "jdbc:mysql://localhost/assignment2";          //connection string for the connection
	private final String username = "assignment2";                                         //user name
	private final String password = "password";                                            //password
 
	
	/**
	 * This method builds the connection with mysql 
	 * @return Connection obj
	 */
	public Connection getConnection(){
		try {
		if(con != null){
			System.out.println("Cannot create new connection, one exists already");
		}
		else{
			con = DriverManager.getConnection(connectionString, username, password);
		}
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return con;
	}
}
