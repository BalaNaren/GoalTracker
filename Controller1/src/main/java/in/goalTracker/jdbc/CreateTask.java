package in.goalTracker.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.goalTracker.util.GetConnection;

public class CreateTask {

	//check if cid can come in the req or not
	public static int newTask(String cusername,String ctask) {
		
		Connection c=null;
		PreparedStatement pstmt=null;	
		int noOfRowsModified=0;
		
		String queryinsert="insert into custtask(`cusername`,`ctask`) values(?,?)";	
		
		c=GetConnection.createConnection();
		
			try {
				if(c!=null) {
				pstmt=c.prepareStatement(queryinsert);
				}
				if(pstmt!=null) {
					pstmt.setString(1, cusername);
					pstmt.setString(2, ctask);				
					
					noOfRowsModified=pstmt.executeUpdate();
				
				}		
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return noOfRowsModified;
		
	}
	
}
