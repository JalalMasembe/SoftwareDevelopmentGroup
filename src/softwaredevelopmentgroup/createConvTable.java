/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredevelopmentgroup;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


        
public class createConvTable {
    
   public static void main(String[] args) {
       create();
    }   
   static void create(){
          Connection con = connectDB.getConnection();
        Statement stmt = null;
        String createString;
        createString = "CREATE TABLE if not exists ConvTable (\n"
                + "            language VARCHAR (30),     \n"
                + "            level  VARCHAR (5),\n"
                + "            context NVARCHAR (255), \n "
                + "            subcontext VARCHAR (255), \n"
                + "            dialogue_txt VARCHAR (255), \n "
                + "            side VARCHAR(5), \n "
                + "            order_id  INTEGER(30),\n  " 
                + "            special_words VARCHAR(30)\n " + " );";
               
        
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