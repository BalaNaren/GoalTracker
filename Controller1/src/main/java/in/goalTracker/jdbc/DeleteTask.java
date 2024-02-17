package in.goalTracker.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.goalTracker.util.GetConnection;

public class DeleteTask {
	
	public static int unwantedTask(String cusername, String ctask) {
		
		Connection c=null;
		PreparedStatement pstmt=null;
		
		int noOfRowsModified=0;
		
		String queryinsert="delete from custinfo where cusername=? and ctask=?";	
		
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
