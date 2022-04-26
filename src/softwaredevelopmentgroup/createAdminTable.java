/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredevelopmentgroup;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 44753
 */
public class createAdminTable {
    
     public static void main(String[] args) {
   Connection con = connectDB.getConnection();
        Statement stmt = null;
        String createString;
        createString = "CREATE TABLE if not exists admin (\n"
                + "            adminID    INTEGER      PRIMARY KEY,\n"
                + "            adminFullName  VARCHAR (30),\n"
                + "            adminEmail NVARCHAR (255), \n "
                + "            adminPassword VARCHAR (255) DEFAULT NULL, \n"
                + "            adminAddress VARCHAR (30), \n "
                + "            adminPostCode VARCHAR(8)\n" + ") ;";          
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(createString);
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }
    }    
    
    
    
    
    
    
    
    
    
    
}
