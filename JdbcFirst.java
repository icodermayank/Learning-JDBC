// this is first jdbc program 
// learning how to create the connection in jdbc using sql database
import java.sql.*;
class JdbcFirst{
	public static void main(String [] args){
		try{
			// Step first :-- Load the driver..
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2 creating connection.
			String url = "jdbc:mysql://localhost:3306/student";
			String username = "root";
			String password = "2244";
// we are calling the get connection method of the driver manager class.
			Connection con = DriverManager.getConnection(url, username, password);
			
			// checking either connection is established or not.
			if(con.isClosed()){
				System.out.println("Connection is closed");
			}
			else{
				System.out.println("Connection is Created..");
			}

		}
		catch(Exception e ){
			e.printStackTrace();
		}
	}
}
