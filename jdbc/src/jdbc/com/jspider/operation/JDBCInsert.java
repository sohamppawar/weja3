package jdbc.com.jspider.operation;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCInsert {
	public static void main(String[] args) throws SQLException {
		
		//Register Driver
		Driver driver =new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		//open connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3?")
	}

}
