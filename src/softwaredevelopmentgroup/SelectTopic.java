/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package softwaredevelopmentgroup;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author aamin
 */
public class SelectTopic extends javax.swing.JFrame {

    /**
     * Creates new form SelectTopic
     */
    
    //initialising topicChosen,conversationChosen and roleChosen variables
            String topicChosen ="";
            String conversationChosen= "";
            String roleChosen = "";
    
    
    public SelectTopic() {
        initComponents();
        
        
        
    }
    //close method to be able to close jframe when you click on "go back"
        public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Topic Selection");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Topic:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Conversation about:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Role:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordering food and drink", "Exchanging personal information", "Making appointments", "Going shopping and asking for prices", "Introductions", "Basic employment issues", "Making invitations", "Socialising in the country", "Asking and giving directions", "University life", "Cross-cultural experiences", "Health matters", "Making travel arrangements", "Weather", "Housing conditions" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Takeaway", "Coffee Order", "Reservation", "Cocktails by card payment", "Water for table" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B" }));

        jButton1.setText("Start Script");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Go back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
       //level 1
       //if jcombobox selected value equals the selected option then display certain options for conversation
        
        if(jComboBox1.getSelectedItem().equals("Ordering food and drink"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Takeaway");
         jComboBox2.addItem("Coffee Order");
         jComboBox2.addItem("Reservation");   
         jComboBox2.addItem("Cocktails by card payment");
         jComboBox2.addItem("Water for table");      
        }
        else
        if(jComboBox1.getSelectedItem().equals("Exchanging personal information"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Social media");
         jComboBox2.addItem("Instagram");
         jComboBox2.addItem("Neighbours parcel");
         jComboBox2.addItem("Description of town");          
        }
        else
        if(jComboBox1.getSelectedItem().equals("Making appointments"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Booking");
         jComboBox2.addItem("Spelling your name");
        }
        else
        if(jComboBox1.getSelectedItem().equals("Going shopping and asking for prices"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Payment");
         jComboBox2.addItem("Refund"); 
        }
        else
        if(jComboBox1.getSelectedItem().equals("Introductions"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Repeat name"); 
        }
        else
        if(jComboBox1.getSelectedItem().equals("Basic employment issues"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Cover");
         jComboBox2.addItem("Interview"); 
        }
        else
        if(jComboBox1.getSelectedItem().equals("Making invitations"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Disneyland");
         jComboBox2.addItem("Help with childs birthday party"); 
        }      
        else
        if(jComboBox1.getSelectedItem().equals("Socialising in the country"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Interview arrangements");       
        }
        else
        if(jComboBox1.getSelectedItem().equals("Asking and giving directions"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Delivery driver");       
        }
        else
        if(jComboBox1.getSelectedItem().equals("University life"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Study in cafe");       
        }
        else
        if(jComboBox1.getSelectedItem().equals("Cross-cultural experiences"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("International food");       
        }
        
        //level 2
        //if jcombobox selected value equals the selected option then display certain options for conversation
        //continuation of if statements
        else
        if(jComboBox1.getSelectedItem().equals("Introductions**"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("1st day in job");   
         jComboBox2.addItem("Job offer"); 
        }
        else
        if(jComboBox1.getSelectedItem().equals("Making appointments**"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Dentist");
         jComboBox2.addItem("Doctor");
        }
        else
        if(jComboBox1.getSelectedItem().equals("Asking and giving directions**"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Hospital visit"); 
         jComboBox2.addItem("Delivery driver"); 
        }
        else
        if(jComboBox1.getSelectedItem().equals("Making invitations**"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Lunch"); 
         jComboBox2.addItem("Charity"); 
         jComboBox2.addItem("Children at wedding"); 
         jComboBox2.addItem("Wedding RSVP"); 
        }
        else
        if(jComboBox1.getSelectedItem().equals("Ordering food and drinks**"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Delayed drinks order"); 
         jComboBox2.addItem("QR code"); 
         jComboBox2.addItem("Cocktails (1)");
         jComboBox2.addItem("Cocktails (2)"); 
         jComboBox2.addItem("Vegan pizza"); 
         jComboBox2.addItem("Reservation");
        }
        else
        if(jComboBox1.getSelectedItem().equals("Going shopping and asking for prices**"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Payment");       
        }
        else
        if(jComboBox1.getSelectedItem().equals("Health matters"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Sick relative"); 
         jComboBox2.addItem("Visiting patient"); 
        }
        else
        if(jComboBox1.getSelectedItem().equals("Socialising in the country**"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Family size"); 
         jComboBox2.addItem("Hobbies"); 
        }
        else
        if(jComboBox1.getSelectedItem().equals("Making travel arrangements"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Expired ticket"); 
        }
        else
        if(jComboBox1.getSelectedItem().equals("Exchanging personal information**"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Age restricted");
        }
        else
        if(jComboBox1.getSelectedItem().equals("Cross-cultural experiences**"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Omelette");       
        }
        else
        if(jComboBox1.getSelectedItem().equals("Weather"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Clothing for weather");
        }
        
        //level 3
        //if jcombobox selected value equals the selected option then display certain options for conversation
        //continuation of if statements
        else
        if(jComboBox1.getSelectedItem().equals("University life***"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Study plans");       
        }
        else
        if(jComboBox1.getSelectedItem().equals("Making travel arrangements**"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("E-ticket");
        }
        else
        if(jComboBox1.getSelectedItem().equals("Going shopping and asking for prices***"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Purchase of computer");  
         jComboBox2.addItem("Cancel hair appointment");  
         jComboBox2.addItem("Payment");  
        }
        else
        if(jComboBox1.getSelectedItem().equals("Socialising in the country***"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Haircut");
        }
        else
        if(jComboBox1.getSelectedItem().equals("Weather**"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Rain in station");       
        }
        else
        if(jComboBox1.getSelectedItem().equals("Ordering food and drink***"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Ordering cocktails by barcode");
        }
        else
        if(jComboBox1.getSelectedItem().equals("Making invitations***"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Offering help for Pink Unicorn party");       
        }
        else
        if(jComboBox1.getSelectedItem().equals("Basic employment issues***"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Job offer");
        }
        else
        if(jComboBox1.getSelectedItem().equals("Housing conditions"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Delivery of packages");       
        }
        
        //level 4
        //if jcombobox selected value equals the selected option then display certain options for conversation
        //continuation of if statements
        else
        if(jComboBox1.getSelectedItem().equals("Going shopping and asking for prices****"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Phone purchase");
        }
        else
        if(jComboBox1.getSelectedItem().equals("Basic employment issues****"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Meet for drinks");       
        }
        else
        if(jComboBox1.getSelectedItem().equals("Making travel arrangements***"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("Disneyland");
        }
        else
        if(jComboBox1.getSelectedItem().equals("Socialising in the country****"))
        {
         jComboBox2.removeAllItems();
         jComboBox2.setSelectedItem(null);
         jComboBox2.addItem("No show date");       
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //if "start script" button is clicked then get whatever options were chosen
        
      topicChosen = jComboBox1.getSelectedItem().toString();
      conversationChosen = jComboBox2.getSelectedItem().toString();
      roleChosen = jComboBox3.getSelectedItem().toString();

      //these options that were chosen will then get updated into the userTable
      try{
             Connection con = connectDB.getConnection();
             Statement stmt = null;  
             
             String sqlString = ("UPDATE user SET "
                             + "userTopic= '" + topicChosen + "'," 
                             + "userConversation= '" + conversationChosen + "',"
                             + "userRole = '" + roleChosen + "'");
               
            
            PreparedStatement pst = con.prepareStatement(sqlString);
            pst.execute();
              

            JOptionPane.showMessageDialog(null, "Script is starting, data updated...");       
            
      }catch (Exception e)
      {
          
          JOptionPane.showMessageDialog(null, e); 
               
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //closes selectTopic JFrame and returns to selectLanguage JFrame
        close();
        SelectLanguage selectL = new SelectLanguage();
        selectL.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectTopic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectTopic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectTopic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectTopic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectTopic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
