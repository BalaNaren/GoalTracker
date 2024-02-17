package in.goalTracker.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class GetConnection {

	public static Connection createConnection() {
		
		MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/goalTracker");
		dataSource.setUser("root");
		dataSource.setPassword("root");
		
		Connection c=null;
		
		try {
			c=dataSource.getConnection();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	
}
