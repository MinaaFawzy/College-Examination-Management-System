package Frames.Panels;

import FCIHCaseStudy.Exam;
import FCIHCaseStudy.Student;
import FCIH_GUI.LoginFrame;
import Model.SQLQueries;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class ExamForm extends javax.swing.JFrame {

    int id;

    public ExamForm(int id) {
        setLocation(250, 10);
        setTitle("Student Dashboard");
        initComponents();
        Exam x = new Exam();
        Exam returned = x.searchExamById(id);
        this.id = id;
        if (returned.getEId() > 0) {
            setPanelData(returned);
        } else {
            System.out.println("Not Found");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        q1 = new javax.swing.ButtonGroup();
        q2 = new javax.swing.ButtonGroup();
        q3 = new javax.swing.ButtonGroup();
        q4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        AreaQ9 = new javax.swing.JTextArea();
        t1 = new javax.swing.JRadioButton();
        f1 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        AreaQ10 = new javax.swing.JTextArea();
        t2 = new javax.swing.JRadioButton();
        f2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        AreaQ11 = new javax.swing.JTextArea();
        t3 = new javax.swing.JRadioButton();
        f3 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        AreaQ12 = new javax.swing.JTextArea();
        t4 = new javax.swing.JRadioButton();
        f4 = new javax.swing.JRadioButton();
        AddExam2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Q1 :");

        AreaQ9.setColumns(20);
        AreaQ9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ9.setRows(5);
        jScrollPane9.setViewportView(AreaQ9);

        t1.setBackground(new java.awt.Color(0, 0, 102));
        q1.add(t1);
        t1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setText("True");

        f1.setBackground(new java.awt.Color(0, 0, 102));
        q1.add(f1);
        f1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        f1.setForeground(new java.awt.Color(255, 255, 255));
        f1.setText("False");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Q2 :");

        AreaQ10.setColumns(20);
        AreaQ10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ10.setRows(5);
        jScrollPane10.setViewportView(AreaQ10);

        t2.setBackground(new java.awt.Color(0, 0, 102));
        q2.add(t2);
        t2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setText("True");

        f2.setBackground(new java.awt.Color(0, 0, 102));
        q2.add(f2);
        f2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        f2.setForeground(new java.awt.Color(255, 255, 255));
        f2.setText("False");
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Q3:");

        AreaQ11.setColumns(20);
        AreaQ11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ11.setRows(5);
        jScrollPane11.setViewportView(AreaQ11);

        t3.setBackground(new java.awt.Color(0, 0, 102));
        q3.add(t3);
        t3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setText("True");

        f3.setBackground(new java.awt.Color(0, 0, 102));
        q3.add(f3);
        f3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        f3.setForeground(new java.awt.Color(255, 255, 255));
        f3.setText("False");
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Q4:");

        AreaQ12.setColumns(20);
        AreaQ12.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ12.setRows(5);
        jScrollPane12.setViewportView(AreaQ12);

        t4.setBackground(new java.awt.Color(0, 0, 102));
        q4.add(t4);
        t4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setText("True");

        f4.setBackground(new java.awt.Color(0, 0, 102));
        q4.add(f4);
        f4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        f4.setForeground(new java.awt.Color(255, 255, 255));
        f4.setText("False");
        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });

        AddExam2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AddExam2.setText("Submit");
        AddExam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddExam2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane11)
                                    .addComponent(jScrollPane10)
                                    .addComponent(jScrollPane12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t2)
                                    .addComponent(f2)
                                    .addComponent(t3)
                                    .addComponent(f3)
                                    .addComponent(t4)
                                    .addComponent(f4))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(AddExam2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(344, 344, 344)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t1)
                                            .addComponent(f1))))))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(t1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f1))
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(t3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f3)
                                .addGap(18, 18, 18)
                                .addComponent(t4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(t2)
                                .addGap(4, 4, 4)
                                .addComponent(f2)))
                        .addGap(28, 28, 28)
                        .addComponent(AddExam2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f2ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f3ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f4ActionPerformed
    public String getSelectedOption(ButtonGroup q) {
        Enumeration<AbstractButton> radioButtons = q.getElements();
        while (radioButtons.hasMoreElements()) {
            AbstractButton currentRadioButton = radioButtons.nextElement();
            if (currentRadioButton.isSelected()) {
                return currentRadioButton.getText();
            }
        }
        return null;
    }
    private void AddExam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddExam2ActionPerformed
        try {
            Exam x = new Exam();
            Exam returned = x.searchExamById(id);
            int count = 0;
            if (getSelectedOption(q1).equals("True") && returned.getA1().equals("t") || getSelectedOption(q1).equals("False") && returned.getA1().equals("f")) {
                count += 1;
                jLabel9.setForeground(Color.green);
            } else {
                jLabel9.setForeground(Color.red);
            }
            if (getSelectedOption(q2).equals("True") && returned.getA2().equals("t") || getSelectedOption(q2).equals("False") && returned.getA2().equals("f")) {
                count += 1;
                jLabel10.setForeground(Color.green);
            } else {
                jLabel10.setForeground(Color.red);
            }
            if (getSelectedOption(q3).equals("True") && returned.getA3().equals("t") || getSelectedOption(q3).equals("False") && returned.getA3().equals("f")) {
                count += 1;
                jLabel11.setForeground(Color.green);
            } else {
                jLabel11.setForeground(Color.red);
            }
            if (getSelectedOption(q4).equals("True") && returned.getA4().equals("t") || getSelectedOption(q4).equals("False") && returned.getA4().equals("f")) {
                count += 1;
                jLabel12.setForeground(Color.green);
            } else {
                jLabel12.setForeground(Color.red);
            }
            String username=LoginFrame.getUserName();
            ResultSet rs=SQLQueries.executeSelectQueryWithCondition("*","student", "username='"+username+"'");
            int studentId=rs.getInt("id");
            jLabel14.setForeground(Color.GREEN);
            jLabel14.setText("Your grade is: " + count);
            SQLQueries.executeUpdateQuerysGrade("student_course set grade", ""+count+"", studentId,id);
            t1.setEnabled(false);
            f1.setEnabled(false);
            t2.setEnabled(false);
            f2.setEnabled(false);
            t3.setEnabled(false);
            f3.setEnabled(false);
            t4.setEnabled(false);
            f4.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(ExamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddExam2ActionPerformed

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
            java.util.logging.Logger.getLogger(ExamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println("4444444444444444444");
                new ExamForm(0).setVisible(true);
            }
        });
    }

    protected void setPanelData(Exam x) {

        AreaQ9.setText("" + x.getQ1());
        AreaQ10.setText("" + x.getQ2());
        AreaQ11.setText("" + x.getQ3());
        AreaQ12.setText("" + x.getQ4());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddExam2;
    private javax.swing.JTextArea AreaQ10;
    private javax.swing.JTextArea AreaQ11;
    private javax.swing.JTextArea AreaQ12;
    private javax.swing.JTextArea AreaQ9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton f1;
    private javax.swing.JRadioButton f2;
    private javax.swing.JRadioButton f3;
    private javax.swing.JRadioButton f4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.ButtonGroup q1;
    private javax.swing.ButtonGroup q2;
    private javax.swing.ButtonGroup q3;
    private javax.swing.ButtonGroup q4;
    private javax.swing.JRadioButton t1;
    private javax.swing.JRadioButton t2;
    private javax.swing.JRadioButton t3;
    private javax.swing.JRadioButton t4;
    // End of variables declaration//GEN-END:variables
}
