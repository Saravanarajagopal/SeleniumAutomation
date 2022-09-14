package Org.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConnection 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	 Class.forName("com.mysql.cj.jdbc.Driver");   // Mention the Database
	 
	 Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/seleniumuser");  // Connect with Mentioned database
	 
	 Statement statement = connection.createStatement();
	 
	 ResultSet result = statement.executeQuery("SELECT * FROM demotable");
	 
	 while(result.next())
	 {
		 System.out.println("ID: "+ result.getInt(1) + "   Name: " + result.getString(2) + 
				 "      NickName : " + result.getString(3) + "   Number : "+ result.getInt(4));
	 }
	}

}
