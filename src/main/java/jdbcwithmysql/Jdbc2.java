package jdbcwithmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Jdbc2 {

	public static void main(String[] args) throws SQLException {
		
		
		//Jdbc Java database connect is an API, using this api we will connect to database.
		

		//First need to create connection: using Conncection Class and DriverManager(java.sql) Class
		
		//create object of Connecton Class
		//Statement create
		//Statement execute 
		//Connection Close.
		
		//Note: we must require MySQL Connector dependecy / jar file to access DriverManager and 
		//some other class and it's predefiened methods.

		
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mamun","root","root12345");
		
		                             
		
		Statement stm = con.createStatement();
		
//		String insert = "insert into students values (186, 'Mizan', 'Ahmed', 'mizan@gmail.com','7452784','New York')";
		
		String getdata = "select id, first_name, last_name, Email from students";
//			stm.execute(insert);
		
		
		
		    ResultSet result =stm.executeQuery(getdata);
		    
		    while (result.next()) {
		    	
		    	int id = result.getInt("id");
		    	String first_name = result.getString("first_name");
		    	String last_name = result.getString("last_name");
		    	String email = result.getString("Email");
		    	
		    	System.out.println(id+" "+first_name+" "+email);
		    }
		    
		   
	
		
			
			con.close();
			
			
		
		
		
		
		
		
	}

}
