/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredevelopmentgroup;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class readCSV {
                public static void main(String[] args) {
            // TODO code application logic here
                csvReader();

            
        }
                static void csvReader(){
            Connection con = connectDB.getConnection();
            Statement stmt = null;
            
            try{
                FileInputStream fstream = new FileInputStream("DialogueDB.csv");
                DataInputStream in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String strLine;
                ArrayList list = new ArrayList();
                int count = 0;
                while((strLine = br.readLine()) != null){
                    
                    list.add(strLine);
                    count++;
              
                    }
                list.remove(0);
                Iterator itr;
                for (itr = list.iterator(); itr.hasNext();){
                    String str = itr.next().toString();
                    String[] splitSt = str.split(",");
                    String language = splitSt[0];
                    String level = splitSt[1];
                    String context = splitSt[2];
                    String subcontext = splitSt[3];
                    String dialogue_txt = splitSt[4];
                    String side = splitSt[5];
                    String order_id = splitSt[6];
                    String special_words = splitSt[7];
                   
                    
                    
                    String sqlString = "INSERT INTO ConvTable (language, level, context, subcontext, dialogue_txt, side, order_id, special_words) VALUES \n" + "('"+language+"','"+level+"','"+context+"','"+subcontext+"','"+dialogue_txt+"','"+side+"','"+order_id+"','"+special_words+"')";
                    con.setAutoCommit(false);
                    stmt = con.createStatement();
                    
                    stmt.executeUpdate(sqlString);
                    stmt.close();
                    con.commit();
                }
                
            }
             
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e); 
                }

            }
}
