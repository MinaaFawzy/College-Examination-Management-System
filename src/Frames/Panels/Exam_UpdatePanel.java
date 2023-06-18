
package Frames.Panels;

import Model.SQLQueries;
import FCIHCaseStudy.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fady_
 */
public class Exam_UpdatePanel extends javax.swing.JPanel {

  
    public Exam_UpdatePanel() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        q1 = new javax.swing.ButtonGroup();
        q2 = new javax.swing.ButtonGroup();
        q3 = new javax.swing.ButtonGroup();
        q4 = new javax.swing.ButtonGroup();
        jTextFieldSearchKey = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabelSucessOrFail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaQ1 = new javax.swing.JTextArea();
        t1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaQ4 = new javax.swing.JTextArea();
        f1 = new javax.swing.JRadioButton();
        f2 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaQ2 = new javax.swing.JTextArea();
        t2 = new javax.swing.JRadioButton();
        f3 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        AreaQ3 = new javax.swing.JTextArea();
        t3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        f4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        t4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 102));

        btnSearch.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabelSucessOrFail.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabelSucessOrFail.setForeground(new java.awt.Color(255, 255, 255));

        AreaQ1.setColumns(20);
        AreaQ1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ1.setRows(5);
        jScrollPane1.setViewportView(AreaQ1);

        t1.setBackground(new java.awt.Color(0, 0, 102));
        q1.add(t1);
        t1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setText("True");

        AreaQ4.setColumns(20);
        AreaQ4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ4.setRows(5);
        jScrollPane2.setViewportView(AreaQ4);

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

        AreaQ2.setColumns(20);
        AreaQ2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ2.setRows(5);
        jScrollPane3.setViewportView(AreaQ2);

        t2.setBackground(new java.awt.Color(0, 0, 102));
        q2.add(t2);
        t2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setText("True");

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

        AreaQ3.setColumns(20);
        AreaQ3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ3.setRows(5);
        jScrollPane4.setViewportView(AreaQ3);

        t3.setBackground(new java.awt.Color(0, 0, 102));
        q3.add(t3);
        t3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setText("True");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Q1 :");

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

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Q2 :");

        t4.setBackground(new java.awt.Color(0, 0, 102));
        q4.add(t4);
        t4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setText("True");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Q3:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Q4:");

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Exam Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldSearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1)
                    .addComponent(f1)
                    .addComponent(t2)
                    .addComponent(f2)
                    .addComponent(t3)
                    .addComponent(f3)
                    .addComponent(f4)
                    .addComponent(t4))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSucessOrFail)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(t1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f1)
                        .addGap(18, 18, 18)
                        .addComponent(t2)
                        .addGap(4, 4, 4)
                        .addComponent(f2)
                        .addGap(16, 16, 16)
                        .addComponent(t3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t4)
                        .addGap(8, 8, 8)
                        .addComponent(f4)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
           Exam x = new Exam();
            Exam returned = x.searchExamById(Integer.parseInt(jTextFieldSearchKey.getText()));
            AreaQ1.setText(returned.getQ1());
            AreaQ2.setText(returned.getQ2());
            AreaQ3.setText(returned.getQ3());
            AreaQ4.setText(returned.getQ4());
            if(returned.getA1().equals("t")){
                t1.setSelected(true);
                f1.setSelected(false);
            }else{
                t1.setSelected(false);
                f1.setSelected(true);
            }
            if(returned.getA2().equals("t")){  
                t2.setSelected(true);
                f2.setSelected(false);
            }else{
                t2.setSelected(false);
                f2.setSelected(true);
            }
            if(returned.getA3().equals("t")){
                t3.setSelected(true); 
                f3.setSelected(false);
            }else{
                t3.setSelected(false);
                f3.setSelected(true);
            }
            if(returned.getA4().equals("t")){
                t4.setSelected(true);
                f4.setSelected(false);
            }else{
                t4.setSelected(false); 
                f4.setSelected(true);
            }
    }//GEN-LAST:event_btnSearchActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           if (!jTextFieldSearchKey.getText().equals("")) {
            Exam x = new Exam();
            if (x.deleteExam(Integer.parseInt(jTextFieldSearchKey.getText()))) {
                jLabelSucessOrFail.setText("Deleted Successfully ... !"); 
                resetPanelData();
            } else {
                jLabelSucessOrFail.setText("Failed to delete ... !");
            }
        } else {
            jLabelSucessOrFail.setText("Missing required Fields ... !  Please, Search By ID before submit ...!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          if (!AreaQ1.getText().equals("") && !AreaQ2.getText().equals("")
                && !AreaQ3.getText().equals("") && !AreaQ4.getText().equals("")
                && getSelectedOption(q1) != null && getSelectedOption(q2) != null
                && getSelectedOption(q3) != null && getSelectedOption(q4) != null) {
            Department dept=null;
            Exam e = new Exam();
            e.setEId(Integer.parseInt(jTextFieldSearchKey.getText()));
            e.setQ1(AreaQ1.getText());
            e.setQ2(AreaQ2.getText());
            e.setQ3(AreaQ3.getText());
            e.setQ4(AreaQ4.getText());
            if (getSelectedOption(q1).equals("True")) {
                e.setA1("t");
            } else {
                e.setA1("f");
            }
            if (getSelectedOption(q2).equals("True")) {
                e.setA2("t");
            } else {
                e.setA2("f");
            }
            if (getSelectedOption(q3).equals("True")) {
                e.setA3("t");
            } else {
                e.setA3("f");
            }
            if (getSelectedOption(q4).equals("True")) {
                e.setA4("t");
            } else {
                e.setA4("f");
            }
            if (e.updateExam()) {
                jLabelSucessOrFail.setText("Exam added successfuly");
                resetPanelData();
            } else {
                jLabelSucessOrFail.setText("Failed to Add Exam... !");
            }
          }else {
            jLabelSucessOrFail.setText("Missing required Fields ... !  Please, complete them before submit ...!");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

       protected void resetPanelData() {
        AreaQ1.setText("");
        AreaQ2.setText("");
        AreaQ3.setText("");
        AreaQ4.setText("");
    }
    protected void setPanelData(Exam x) {
        AreaQ1.setText("" + x.getQ1());
        AreaQ2.setText("" + x.getQ2());
        AreaQ3.setText("" + x.getQ3());
        AreaQ4.setText("" + x.getQ4());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaQ1;
    private javax.swing.JTextArea AreaQ2;
    private javax.swing.JTextArea AreaQ3;
    private javax.swing.JTextArea AreaQ4;
    private javax.swing.JButton btnSearch;
    private javax.swing.JRadioButton f1;
    private javax.swing.JRadioButton f2;
    private javax.swing.JRadioButton f3;
    private javax.swing.JRadioButton f4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelSucessOrFail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextFieldSearchKey;
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
