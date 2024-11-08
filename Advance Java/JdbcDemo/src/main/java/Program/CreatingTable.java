package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTable {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		

		// 1st 2 step is basic for all
		 //1.Load and Register  the DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.Establish Connection-(MYSQL-url,username,pw)
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
     //3.Create a statement(interface obj)-Like viechiel
		Statement st=con.createStatement();
		
		//4.Executing the query-creating table and column name
		st.execute("Create table student(id integer, name varchar(25) , age integer)");  // dont change the line 
		System.out.println("TABLE WAS CREATED SUCCESSFULLY");
		
		//5. skip
		
		
		 //6.Close the connection
		con.close();
	}

}
