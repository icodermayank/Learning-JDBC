// jdbc Second program..
// Creating Table using the ExecuteUpdate Query
import java.sql.*;

class CreateTableJdbc{
	public static void main(String args []){
		try{
			// load the jdbc driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			// creating connection,
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "2244");
			// output message to the user.
			System.out.println(con.isClosed()?"Connection not created..":"Connection Created Successfully..");

			// Create query ..
			String q = "Create table students (id int(20) primary key auto_increment, name varchar(50) not null, city varchar(50))";

			// create Statement..
			Statement stmt = con.createStatement();

			// executing query..
			stmt.executeUpdate(q);
			System.out.println("Table created Successfully");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}