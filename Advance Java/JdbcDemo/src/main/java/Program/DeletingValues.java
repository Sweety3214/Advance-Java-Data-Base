package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletingValues {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. Load and Register the DRIVER
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // 2. Establish Connection (MYSQL URL, username, password)-for delete the valuue mention the DB name as "School"
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
        
        // 3. Create a statement (interface object)
        Statement st = con.createStatement();
        
   
   //5.Deleting the values     (id=1 means 1 row)
  st.execute("Delete  from student where id IN (6)");
        
        System.out.println("VALUES WERE DELETED SUCCESSFULLY");
        
        // 6. Close the connection
        con.close();
    }
}
