package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class UpdatingValues {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// 1. Load and Register the DRIVER
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    // 2. Establish Connection (MYSQL URL, username, password)-for delete the valuue mention the DB name as "School"
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
    
    
    // 3. Create a statement (interface object)
    Statement st = (Statement) con.createStatement();
    
    //Upadatint the values
    st.execute("UPDATE student SET name='Danu' where id=1" );
    st.execute("UPDATE student SET name='Tanu' where id=2 and age=26" );
    st.execute("UPDATE student SET name='lanu' ,age=22 where id=3 and age=26" );
    System.out.println("VALUES UPDATED SUCCESSFULLY");
    
    //close
    con.close();
    
    
    
	
}
}
