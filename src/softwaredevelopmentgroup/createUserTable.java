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
        
public class createUserTable {
    
   public static void main(String[] args) {
       
       
    }  
   static void create(){
   Connection con = connectDB.getConnection();
        Statement stmt = null;
        String createString;
        createString = "CREATE TABLE if not exists user (\n"
                + "            userID    INTEGER      PRIMARY KEY,\n"
                + "            userFullName  VARCHAR (30),\n"
                + "            userEmail NVARCHAR (255), \n "
                + "            userPassword VARCHAR (255) DEFAULT NULL, \n"
                + "            userTelephone VARCHAR (30), \n "
                + "            userLanguageChoice VARCHAR(30), \n "
                + "            userLanguageLevel  VARCHAR(30),\n  " 
                + "            userTopic VARCHAR(30),\n "
                + "            userConversation VARCHAR(30),\n "
                + "            userRole VARCHAR(30)\n " + " );";
               
        
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