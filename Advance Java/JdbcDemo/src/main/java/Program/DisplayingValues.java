package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayingValues {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Load and Register the DRIVER
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
	    // 2. Establish Connection (MYSQL URL, username, password)-for delete the valuue mention the DB name as "School"
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
	    
	    
	    // 3. Create a statement (interface object)
	    Statement st = (Statement) con.createStatement();
	    
	    // using executeQuery to display all the column and row
	   ResultSet rs=st.executeQuery("SELECT * FROM STUDENT");
	   System.out.println("ID\t NAME\t Age");
	   
	   while(rs.next()) {
		   System.out.println(rs.getInt(1)+"\t" +rs.getString(2)+"\t" + rs.getInt(3));
	   }
	  
	    
	    //close
	    con.close();
	    
	    
	    
		
	}
}
