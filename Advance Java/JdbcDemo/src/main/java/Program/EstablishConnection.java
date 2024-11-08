package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishConnection {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	
	// 1st 2 step is basic for all
	 //1.Load and Register  the DRIVER
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//2.Establish Connection-(MYSQL-url,username,pw)
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");

System.out.println("CONNECTION ESTABILISHED SUCCESSFULLY");


}
}
