package feedback_form;
//import java.awt.EventQueue;
import javax.swing.JFrame;
import java.sql.*;
import feedback_form.sqlite_connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;


public class Page extends javax.swing.JFrame {

    /**
     * Creates new form Page
     */
    
    
    Connection connection=  null;
    public Page() {
        initComponents();
        connection=sqlite_connection.dbConnector();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame3 = new javax.swing.JFrame();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jSlider1 = new javax.swing.JSlider();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(235, 114, 114));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 1, 18)); // NOI18N
        jLabel1.setText("Name :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 110, 70, 30);

        jTextField1.setForeground(new java.awt.Color(222, 58, 23));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(530, 100, 426, 34);

        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 1, 18)); // NOI18N
        jLabel2.setText("Email :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 160, 80, 24);

        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 1, 15)); // NOI18N
        jLabel3.setText("How did you find this Organization?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 210, 320, 20);

        jLabel4.setFont(new java.awt.Font("Abyssinica SIL", 1, 15)); // NOI18N
        jLabel4.setText("How would you rate our Products and Services :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 260, 430, 20);

        jLabel5.setFont(new java.awt.Font("Abyssinica SIL", 1, 15)); // NOI18N
        jLabel5.setText("Comments or Suggestions:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 340, 230, 20);

        jLabel6.setFont(new java.awt.Font("Abyssinica SIL", 1, 15)); // NOI18N
        jLabel6.setText(" Do you think this form looks nice?\t");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 460, 320, 18);

        jTextField2.setForeground(new java.awt.Color(233, 60, 11));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(530, 150, 426, 32);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Another website", "A Search Engine", "A friend told you", "From an Email", "Another way not listed here"}));
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(600, 200, 278, 34);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(" Enter any comments or suggestions \n you have here.");
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea1FocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(600, 320, 306, 81);

        jButton1.setBackground(new java.awt.Color(54, 58, 143));
        jButton1.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(243, 233, 233));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 550, 85, 29);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(360, 600, 270, 12);
        getContentPane().add(filler1);
        filler1.setBounds(553, 185, 0, 0);

        jSlider1.setMaximum(10);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setOpaque(true);
        jSlider1.setValueIsAdjusting(true);
        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintTicks(true);
        jSlider1.setPaintLabels(true);
        jSlider1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jSlider1FocusLost(evt);
            }
        });
        getContentPane().add(jSlider1);
        jSlider1.setBounds(492, 428, 266, 64);

        jToggleButton1.setBackground(new java.awt.Color(99, 105, 192));
        jToggleButton1.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 15)); // NOI18N
        jToggleButton1.setText("Administration Login");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(974, 12, 205, 48);

        jLabel7.setFont(new java.awt.Font("STIX", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(70, 79, 224));
        jLabel7.setText("FeedBack Form");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 10, 621, 79);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Excellent");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(570, 260, 87, 22);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Good");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(660, 260, 60, 31);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Average");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(730, 260, 78, 31);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Poor");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(820, 260, 55, 31);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Needs an Overhaul");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(880, 260, 151, 31);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feedback_form/Plain-White-Background-Wallpaper-Hd.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, -1, 1210, 740);

        setBounds(0, 0, 1213, 764);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        
         //setVisible(false);
         this.dispose();
         Login login=new Login();
         login.setVisible(true);
         
            
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        try
        {
   
            String query="insert into Data (Name,Email,Find,Rate,Comment,Point) values (?,?,?,?,?,?)";
            PreparedStatement pst= connection.prepareStatement(query);
            
                String radio=null;
                if(jRadioButton1.isSelected() == true) radio = "excellent";
                if(jRadioButton2.isSelected() == true) radio = "good";
                if(jRadioButton3.isSelected() == true) radio = "average";
                if(jRadioButton4.isSelected() == true) radio = "poor";
                if(jRadioButton5.isSelected() == true) radio = "need an overhaul";
            
              //  String f1,f2;
              //  f1=jTextField1.getText();
              //  f2=jTextField2.getText();
               /* if(f1!=""||f2!=""||f1!=" "||f2!=" "||f1!=null||f2!=null)
                {
                    jProgressBar1.setValue(00);
                    JOptionPane.showMessageDialog(null,"Any Field cannot be empty");
                }*/
                    
            pst.setString(1,jTextField1.getText());
            pst.setString(2,jTextField2.getText()); 
            pst.setString(3,jComboBox1.getSelectedItem().toString());
            pst.setString(4,radio);
            pst.setString(5,jTextArea1.getText());
            pst.setInt(6,jSlider1.getValue());
            
            
            
            
             pst.execute();
          
            for(int i=0;jProgressBar1.getValue()<100;i++)
            jProgressBar1.setValue(jProgressBar1.getValue()+5);
            jProgressBar1.setValue(0);
           
            
                jTextField1.setText("");
            jTextField2.setText("");
            jComboBox1.setSelectedIndex(0);
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jTextArea1.setText(" Enter any comments or suggestions \n" +" you have here.");
            jSlider1.setValue(5);
            jProgressBar1.setValue(0);
            
            pst.close();
            JOptionPane.showMessageDialog(null, "Thanks For Your Feedback");
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
         jProgressBar1.setValue(jProgressBar1.getValue()+17);
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
         jProgressBar1.setValue(jProgressBar1.getValue()+17);
    }//GEN-LAST:event_jTextField2FocusLost

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        // TODO add your handling code here:
         jProgressBar1.setValue(jProgressBar1.getValue()+17);
    }//GEN-LAST:event_jComboBox1FocusLost

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        // TODO add your handling code here:
         jProgressBar1.setValue(jProgressBar1.getValue()+17);
    }//GEN-LAST:event_jTextArea1FocusGained

    private void jTextArea1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusLost
        // TODO add your handling code here:
         jProgressBar1.setValue(jProgressBar1.getValue()+17);
    }//GEN-LAST:event_jTextArea1FocusLost

    private void jSlider1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSlider1FocusLost
        // TODO add your handling code here:
         jProgressBar1.setValue(jProgressBar1.getValue()+17);
    }//GEN-LAST:event_jSlider1FocusLost

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new Page().setVisible(true);
            }
        });
    }
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private static class textFieldName {

        public textFieldName() {
        }
    }
}
