package guiSelfProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import selfproject.Admin;
import selfproject.SelfProject;

public class G_Admin extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet re = null;
    String k;
    AdminAccount ad=new AdminAccount();
    public G_Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        //con = Admin.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldUserName = new javax.swing.JTextField();
        jPasswordFieldAdminPassword = new javax.swing.JPasswordField();
        jButtonAdminLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        employee = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        admin2 = new javax.swing.JButton();
        employee2 = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        show = new javax.swing.JButton();
        disable = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUserName.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 220, 30));

        jPasswordFieldAdminPassword.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordFieldAdminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldAdminPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordFieldAdminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 220, 30));

        jButtonAdminLogin.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAdminLogin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonAdminLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdminLogin.setText("Login");
        jButtonAdminLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAdminLoginMouseClicked(evt);
            }
        });
        jButtonAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 70, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 130, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 130, 40));

        admin.setBackground(new java.awt.Color(102, 102, 102));
        admin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setText("Admin");
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 100, -1));
        admin.getAccessibleContext().setAccessibleDescription("");
        admin.getAccessibleContext().setAccessibleParent(jLabel4);

        employee.setBackground(new java.awt.Color(102, 102, 102));
        employee.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        employee.setForeground(new java.awt.Color(255, 255, 255));
        employee.setText("Employee");
        employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeMouseClicked(evt);
            }
        });
        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });
        jPanel1.add(employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("OR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 40, 30));

        admin2.setBackground(new java.awt.Color(102, 102, 102));
        admin2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        admin2.setForeground(new java.awt.Color(255, 255, 255));
        admin2.setText("Admin");
        admin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin2MouseClicked(evt);
            }
        });
        admin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin2ActionPerformed(evt);
            }
        });
        jPanel1.add(admin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 100, -1));

        employee2.setBackground(new java.awt.Color(102, 102, 102));
        employee2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        employee2.setForeground(new java.awt.Color(255, 255, 255));
        employee2.setText("Employee");
        employee2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employee2MouseClicked(evt);
            }
        });
        jPanel1.add(employee2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 100, -1));

        signup.setBackground(new java.awt.Color(204, 0, 0));
        signup.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Sign up");
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, 30));

        show.setBackground(new java.awt.Color(102, 102, 102));
        show.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setText("show");
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, 30));

        disable.setBackground(new java.awt.Color(102, 102, 102));
        disable.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        disable.setForeground(new java.awt.Color(255, 255, 255));
        disable.setText("show");
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        disable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disableActionPerformed(evt);
            }
        });
        jPanel1.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\New folder\\SelfProject\\src\\img\\-.jpg")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminLoginActionPerformed
        // TODO add your handling code here:
        
        
        /* try {
            ps = con.prepareStatement(log1);
            ps.setString(1, jTextFieldUserName.getText());
            ps.setString(2, jPasswordFieldAdminPassword.getText());
            re = ps.executeQuery();
            if (re.next()) {
                this.dispose();
                new AdminAccount().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(G_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }//GEN-LAST:event_jButtonAdminLoginActionPerformed
    
    private void jPasswordFieldAdminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldAdminPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldAdminPasswordActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_adminActionPerformed

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        // TODO add your handling code here:
        admin.setEnabled(false);
        admin.setVisible(false);
        admin2.setEnabled(true);
        admin2.setVisible(true);
        /*employee.setEnabled(true);
        employee.setVisible(true);
        employee2.setEnabled(true);
        employee2.setVisible(true);*/

        admin.setText("Admin");
        k = admin.getText();
        System.out.println(k);
    }//GEN-LAST:event_adminMouseClicked

    private void employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeMouseClicked
        // TODO add your handling code here:
        /*  admin.setEnabled(false);
        admin.setVisible(false);
        admin2.setEnabled(false);
        admin2.setVisible(false);*/
        employee.setEnabled(false);
        employee.setVisible(false);
        employee2.setEnabled(true);
        employee2.setVisible(true);

        employee.setText("Employee");
        k = employee.getText();
        System.out.println(k);
    }//GEN-LAST:event_employeeMouseClicked

    private void admin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin2ActionPerformed

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeActionPerformed

    private void admin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin2MouseClicked
        // TODO add your handling code here:
        admin.setEnabled(true);
        admin.setVisible(true);
        admin2.setEnabled(false);
        admin2.setVisible(false);
        /* employee.setEnabled(true);
        employee.setVisible(true);
        employee2.setEnabled(false);
        employee2.setVisible(false);*/

        employee.setText("Admin");
        k = employee.getText();
        System.out.println(k);
    }//GEN-LAST:event_admin2MouseClicked

    private void employee2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employee2MouseClicked
        // TODO add your handling code here:
        /* admin.setEnabled(false);
        admin.setVisible(false);
        admin2.setEnabled(false);
        admin2.setVisible(false);*/
        employee.setEnabled(true);
        employee.setVisible(true);
        employee2.setEnabled(false);
        employee2.setVisible(false);

        employee.setText("Employee");
        k = employee.getText();
        System.out.println(k);
    }//GEN-LAST:event_employee2MouseClicked

    private void jButtonAdminLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdminLoginMouseClicked
        // TODO add your handling code here:
        Connection con=Admin.connect();
        if(con==null)
        {
         JOptionPane.showMessageDialog(this, "Connection Faild");   
        }else{
        String log1 = "SELECT * FROM AdminAcount where username='"+jTextFieldUserName.getText()+"' and password='"+ jPasswordFieldAdminPassword.getText()+"' ";
        String log2 = "SELECT * FROM EmployeeAccount where username='"+jTextFieldUserName.getText()+"' and password='"+ jPasswordFieldAdminPassword.getText()+"' ";
        
        if(null==k){
            JOptionPane.showMessageDialog(this, "SELECT USER OR ADMIN FOR LOGIN");
        }else switch(k){
            case "Admin":
        
             try {
                    Statement st=con.createStatement();
                    ResultSet re=st.executeQuery(log1);
                   
                    if (re.next()){
                     System.out.println("Admin");
                     AdminAccount a=new AdminAccount();
                     a.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(this," Wrong this username or pssword");
                    }
                        
                } catch (SQLException ex) {
                    Logger.getLogger(G_Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                break;
                case "Employee":
        
             try {
                 Statement st=con.createStatement();
                    ResultSet re=st.executeQuery(log2);
                   
                    if (re.next()){
                     System.out.println("Employee");
                     Employee r=new Employee();
                     r.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(this," Wrong this username or pssword");
                    }
                        
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null,ex);
                }
        
                break;
                default:
                break;
             
        }
            //  ad.setVisible(true);
              this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonAdminLoginMouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        Regester t=new Regester();
        t.setVisible(true);
    }//GEN-LAST:event_signupMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        // TODO add your handling code here:
        disable.setVisible(true);
        disable.setEnabled(true);
        jPasswordFieldAdminPassword.setEchoChar((char)0);
        show.setVisible(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void disableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disableActionPerformed

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        // TODO add your handling code here:
        show.setVisible(true);
        show.setEnabled(true);
        jPasswordFieldAdminPassword.setEchoChar((char)42);
        disable.setVisible(false);
        disable.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

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
            java.util.logging.Logger.getLogger(G_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new G_Admin().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton admin2;
    private javax.swing.JButton disable;
    private javax.swing.JButton employee;
    private javax.swing.JButton employee2;
    private javax.swing.JButton jButtonAdminLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldAdminPassword;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JButton show;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables

}
