/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package team;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.regex.*;
import java.util.*;
import java.util.logging.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author risha
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
        this.setLocationRelativeTo(rootPane);
        setTitle("Sign Up");

        
    }
    
    String firname, lasname, password, uname, mail, mob1;
    int id=0;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lname = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        signupbutton = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fnl = new javax.swing.JLabel();
        fnl1 = new javax.swing.JLabel();
        us = new javax.swing.JLabel();
        lln = new javax.swing.JLabel();
        ml = new javax.swing.JLabel();
        mb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnameKeyReleased(evt);
            }
        });
        jPanel2.add(lname);
        lname.setBounds(210, 130, 208, 30);
        jPanel2.add(user);
        user.setBounds(210, 260, 208, 30);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel2.setText("SIGN UP");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(210, 10, 183, 74);

        signupbutton.setBackground(new java.awt.Color(0, 204, 153));
        signupbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signupbutton.setText("SIGN UP");
        signupbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(signupbutton);
        signupbutton.setBounds(190, 410, 208, 36);
        jPanel2.add(pass);
        pass.setBounds(210, 300, 208, 30);

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel2.add(email);
        email.setBounds(210, 170, 208, 30);

        mob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobKeyReleased(evt);
            }
        });
        jPanel2.add(mob);
        mob.setBounds(210, 220, 208, 30);

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameKeyReleased(evt);
            }
        });
        jPanel2.add(fname);
        fname.setBounds(210, 90, 208, 30);

        jLabel4.setText("First Name:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 90, 67, 16);

        jLabel5.setText("Last Name:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 140, 67, 16);

        jLabel6.setText("Email ID:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(70, 180, 67, 16);

        jLabel7.setText("Mobile Number:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(70, 220, 95, 16);

        jLabel8.setText("Username:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(70, 260, 67, 16);

        jLabel9.setText("Password:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(70, 300, 67, 16);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\risha\\OneDrive\\Desktop\\dp2.png")); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(270, 310, 360, 220);
        jPanel2.add(fnl);
        fnl.setBounds(440, 90, 150, 0);

        fnl1.setText(".");
        jPanel2.add(fnl1);
        fnl1.setBounds(440, 90, 150, 20);

        us.setText(".");
        us.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usKeyReleased(evt);
            }
        });
        jPanel2.add(us);
        us.setBounds(440, 270, 130, 16);

        lln.setText(".");
        jPanel2.add(lln);
        lln.setBounds(440, 140, 130, 16);

        ml.setText(".");
        ml.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mlKeyReleased(evt);
            }
        });
        jPanel2.add(ml);
        ml.setBounds(440, 180, 130, 16);

        mb.setText(".");
        jPanel2.add(mb);
        mb.setBounds(440, 230, 130, 16);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\risha\\OneDrive\\Desktop\\dp1.png")); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel10.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel10.setText("TAX BUDDY!");

        jLabel11.setFont(new java.awt.Font("Bodoni MT Condensed", 0, 24)); // NOI18N
        jLabel11.setText("Manage your expense in no time!");

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel12.setText("Login Here!");

        login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        login.setText("LOG IN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
int tem;
    private void signupbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbuttonActionPerformed
    if(validation()) {
            data();
        }
    
    }  
    
       void data(){
           String uname = user.getText();
           ResultSet rs =null;
           PreparedStatement pst =null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/taxmanagement", "root", "root");
            String sql = "insert into sign(fname,lname,email,mob,user,pass) values(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, fname.getText());
            stmt.setString(2, lname.getText());
            stmt.setString(3, email.getText());
            stmt.setString(4, mob.getText());
            stmt.setString(5, user.getText());
            stmt.setString(6, pass.getText());
            
            
            String sql1 ="SELECT user FROM sign WHERE user=?";
            pst=con.prepareCall(sql1);
            pst.setString(1, uname);
            rs=pst.executeQuery();
            
            
            if (!rs.next()){
                JOptionPane.showMessageDialog(rootPane, "Username Available!");
                tem = stmt.executeUpdate();
                loginPage H =new loginPage();
                    H.setVisible(true);
                    H.setLocationRelativeTo(rootPane);
                    dispose();
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Try another Username!");
                
        con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_signupbuttonActionPerformed
boolean validation() {
        
        firname = fname.getText();
        lasname = lname.getText();
        password =pass.getText();
        uname = user.getText();
        mail = email.getText();
        mob1 = mob.getText();
        
        if (firname.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the first name");
            return false;
        }
        if (lasname.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the last name");
            return false;
        }
        if (uname.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the username");
            return false;
        }
        if (password.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the password");
            return false;
        }
        if (mail.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the email");
            return false;
        }
        if (mob1.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the mobile number");
            return false;
        }
        if (password.length()<8) {
            JOptionPane.showMessageDialog(this, "Password must be greater than 8.");
            return false;
        }
        if (mob1.length()!=10) {
            JOptionPane.showMessageDialog(this, "Enter a valid mobile number");
            return false;
        }
        
        return true;
    }
  
    public static Message prepareMessage (Session session, String myAccount, String recepient){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccount));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("JAVA MAIL");
            message.setText("My First Mail!");
            return message;
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
        
    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
       if( tem<=0)
           JOptionPane.showMessageDialog(null, "signup first");
       else     
           new loginPage().setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z]{0,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(fname.getText());
        if(!(match.matches())){
        fnl1.setText("Enter valid name.");
    }
        else{
            fnl1.setText(null);
        }
    }//GEN-LAST:event_fnameKeyReleased

    private void usKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9]{0,30}[@._]$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(user.getText());
        if(!(match.matches())){
        us.setText("Enter valid username.");
    }
        else{
            us.setText(null);
        }
    }//GEN-LAST:event_usKeyReleased

    private void mobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobKeyReleased
String PATTERN="^[0-9]{0,12}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(mob.getText());
        if(!(match.matches())){
        mb.setText("Enter valid number.");
    }
        else{
            mb.setText(null);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_mobKeyReleased

    private void mlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mlKeyReleased
     // TODO add your handling code here:
    }//GEN-LAST:event_mlKeyReleased

    private void lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyReleased
    String PATTERN="^[a-zA-Z]{0,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(lname.getText());
        if(!(match.matches())){
        lln.setText("Enter valid name.");
    }
        else{
            lln.setText(null);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_lnameKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9]{0,30}@[a-zA-Z]{0,10}[.][a-zA-Z]{0,10}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(email.getText());
        if(!(match.matches())){
        ml.setText("Enter valid email.");
    }
        else{
            ml.setText(null);
        }        
    }//GEN-LAST:event_emailKeyReleased
     public void information() {
        
    }
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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel fnl;
    private javax.swing.JLabel fnl1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lln;
    private javax.swing.JTextField lname;
    private javax.swing.JButton login;
    private javax.swing.JLabel mb;
    private javax.swing.JLabel ml;
    private javax.swing.JTextField mob;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton signupbutton;
    private javax.swing.JLabel us;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
