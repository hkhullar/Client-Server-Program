/* File: CabbageDaoImpl.java
 * Author: Himanshu Khullar & Chirag Kachariya
 * Date: November, 2017
 * Description:This class inserts the values to the database for the cabbage
 * Professor Stanley Pieda
 */

 
package dataaccesslayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import datatransfer.Cabbage;

public class CabbageDaoImpl implements CabbageDao{
	
	
	/**
	 * This will insert the cabbage values to the database
	 */
    public void insertCabbage(Cabbage cabbage){
    	DataSource source = new DataSource();
		Connection con = source.getConnection();         //getting the connection
		PreparedStatement pstmt = null;
		try{
			pstmt = con.prepareStatement(
					"INSERT INTO Cabbages (linenumber, alpha, beta, charlie, delta, uuid) " +
					"VALUES(?, ?, ?, ?, ?, ?)");
			pstmt.setInt(1, cabbage.getLineNumber());   //getting the value of line number
			pstmt.setString(2, cabbage.getAlpha());     //getting the value of alpha
			pstmt.setString(3, cabbage.getBeta());	    // getting the value of beta
			pstmt.setString(4, cabbage.getCharlie());   // getting the value of charlie
			pstmt.setString(5,  cabbage.getDelta());    // getting the value of delta
			pstmt.setString(6,  cabbage.getUUID());     // getting the value of uuid
			pstmt.executeUpdate();
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		finally{
			try{ if(pstmt != null){ pstmt.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}     //message on exception
			try{ if(con != null){ con.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
		}
	}

    
    /**
     * This method is used for setting the values for cabbages by getting the uuid
     */
	@Override
	public Cabbage getCabbageByUUID(String uuid){
		DataSource source = new DataSource();
		Connection con = source.getConnection();
		PreparedStatement pstmt = null;
		Cabbage cabbage = new Cabbage();
		try{
			pstmt = con.prepareStatement(
					"SELECT * FROM Cabbages WHERE uuid = ?");      //query for getting the cabbages using uuid number
			pstmt.setString(1, uuid);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			cabbage.setId(rs.getInt("id"));                 //setting the id
			cabbage.setLineNumber(rs.getInt("linenumber")); //setting the line number
			cabbage.setAlpha(rs.getString("alpha"));        //setting alpha
			cabbage.setBeta(rs.getString("beta"));          //setting beta
			cabbage.setCharlie(rs.getString("charlie"));    //setting charlie
			cabbage.setDelta(rs.getString("delta"));        //setting delta
			cabbage.setUUID(rs.getString("uuid"));          // setting uuid
		}  
		
		/**
		 * for catching the sql exception
		 */
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		finally{
			try{ if(pstmt != null){ pstmt.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(con != null){ con.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
		}
		return cabbage;
	}
}
