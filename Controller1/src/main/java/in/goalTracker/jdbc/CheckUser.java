package in.goalTracker.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.goalTracker.util.GetConnection;

public class CheckUser {
	
	public static int checkExistingUser(String cusername,String cpassword) {
		
		Connection c=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int noOfRowsReturned=0;
		
		
		String querycheck="select * from custinfo where cusername=? and cpassword=?";	
		
		c=GetConnection.createConnection();
		
			try {
				if(c!=null) {
				pstmt=c.prepareStatement(querycheck);
				}
				if(pstmt!=null) {					
					pstmt.setString(1, cusername);
					pstmt.setString(2, cpassword);					
					rs=pstmt.executeQuery();	
				}
				if(rs!=null) {
					noOfRowsReturned=1; 
				}
				
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return noOfRowsReturned;
		
	}

}
