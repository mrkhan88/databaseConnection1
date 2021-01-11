package jdbcwithmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mamun", "root", "root12345");
		
		Statement stmt =con.createStatement();
		
		
		String s = "insert into students values(105,'Hasan','Ahmed','hasn@gmail.com','3242452','New York')";
		
		stmt.execute(s);
		
		
		con.close();

	}

}
