package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayingValues2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		// 1. Load and Register the DRIVER
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
	    // 2. Establish Connection (MYSQL URL, username, password)-for delete the valuue mention the DB name as "School"
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");

	   Statement st= con.createStatement();
	   //Displaying the values
	   //only selecting column name using SQL query formate
	 ResultSet rs =  st.executeQuery("SELECT Name ,age FROM student");
	 System.out.println("Name\t Age");
	 System.out.println("  ");
	 //search next line
	    while(rs.next()) {
	    	//column name
	    	System.out.println(rs.getString("Name")+"\t"+rs.getString("Age"));
	    }
	    con.close();
	}

}
