package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingValue {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. Load and Register the DRIVER
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // 2. Establish Connection (MYSQL URL, username, password)
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
        
        // 3. Create a statement (interface object)
        Statement st = con.createStatement();
        
        // 4. Executing the query - creating table and column name
        st.execute("Insert into student values( 1, 'Banu' , 26)");
        st.execute("Insert into student values( 2, 'Banu' , 26)");
        st.execute("Insert into student values( 3, 'Banu' , 26)");  // Don't change this line
        st.execute("Insert into student values(4 , 'Sweety' , 24)");  // Don't change this line
        st.execute("Insert into student values(5 , 'Jo' , 29)");  // Don't change this line
       
      
        
  
        
        System.out.println("VALUES WERE INSERTED SUCCESSFULLY");
        
        // 6. Close the connection
        con.close();
    }
}
