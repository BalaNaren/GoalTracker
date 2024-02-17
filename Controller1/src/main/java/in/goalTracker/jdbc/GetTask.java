package in.goalTracker.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.goalTracker.util.GetConnection;

public class GetTask {
	
	public static String getAllTasks(String cusername) {
				
		Connection c=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String result="";
		
		String queryinsert="select ctask from custtask where cusername=?";	
		
		c=GetConnection.createConnection();
		
			try {
				if(c!=null) {
				pstmt=c.prepareStatement(queryinsert);
				}
				if(pstmt!=null) {
					pstmt.setString(1, cusername);	
					rs=pstmt.executeQuery();
				}
				while(rs.next()) {
					result=result+";"+rs.getString(1);
				}
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;			
		}
	
}
