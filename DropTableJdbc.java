// To drop any table first we have to assure that table exists.
// steps to drop table.
// step 1 Load the jdbc Driver 
// step 2 create connection
// step 3 create query or we can directly insert query into the executeUpdate method.
// step 4 create Statement obj using the connection obj and createStatement() method.
// execute query
// close the connection 

import java.sql.*;
public class DropTableJdbc {
    public static void main (String [] args){
        try{
            // load the jdbc driver.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // creating connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "2244");

            // checking connection is either created or not?
            System.out.println(con.isClosed()?"Connection Failed":"Connection created successfully..");

            // create Query.
            String q = "drop table students";

            // creating Statement.
            Statement stmt = con.createStatement();

            //executing Query.
            stmt.executeUpdate(q);

            System.out.println("Table Deleted Successfully.");

            // close the connection 
            con.close();



        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
