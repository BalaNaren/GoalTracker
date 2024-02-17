package in.goalTracker.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.goalTracker.util.GetConnection;


public class CreateUser {
	
	public static int newUser(String cusername, String cemail,String cpassword) {		
		
		Connection c=null;
		PreparedStatement pstmt=null;		
		int noOfRowsModified=0;
		
		String queryinsert="insert into custinfo(`cusername`,`cemail`,`cpassword`) values(?,?,?)";	
		
		c=GetConnection.createConnection();
		
			try {
				if(c!=null) {
				pstmt=c.prepareStatement(queryinsert);
				}
				if(pstmt!=null) {
					pstmt.setString(1, cusername);
					pstmt.setString(2, cemail);
					pstmt.setString(3, cpassword);
					
					noOfRowsModified=pstmt.executeUpdate();
				
				}		
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return noOfRowsModified;
		}
		
		
	}


