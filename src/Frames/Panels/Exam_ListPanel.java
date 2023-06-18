
package Frames.Panels;

import Model.SQLQueries;
import FCIHCaseStudy.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fady_
 */
public class Exam_ListPanel extends javax.swing.JPanel {


    public Exam_ListPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        q1 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        q2 = new javax.swing.ButtonGroup();
        q3 = new javax.swing.ButtonGroup();
        q4 = new javax.swing.ButtonGroup();
        jTextFieldSearchKey = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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

        setBackground(new java.awt.Color(0, 0, 102));

        jTextFieldSearchKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchKeyActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Exam Id");

        AreaQ1.setColumns(20);
        AreaQ1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ1.setRows(5);
        AreaQ1.setEnabled(false);
        jScrollPane1.setViewportView(AreaQ1);

        t1.setBackground(new java.awt.Color(0, 0, 102));
        q1.add(t1);
        t1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setText("True");
        t1.setEnabled(false);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        AreaQ4.setColumns(20);
        AreaQ4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ4.setRows(5);
        AreaQ4.setEnabled(false);
        jScrollPane2.setViewportView(AreaQ4);

        f1.setBackground(new java.awt.Color(0, 0, 102));
        q1.add(f1);
        f1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        f1.setForeground(new java.awt.Color(255, 255, 255));
        f1.setText("False");
        f1.setEnabled(false);
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
        f2.setEnabled(false);
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });

        AreaQ2.setColumns(20);
        AreaQ2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ2.setRows(5);
        AreaQ2.setEnabled(false);
        jScrollPane3.setViewportView(AreaQ2);

        t2.setBackground(new java.awt.Color(0, 0, 102));
        q2.add(t2);
        t2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setText("True");
        t2.setEnabled(false);

        f3.setBackground(new java.awt.Color(0, 0, 102));
        q3.add(f3);
        f3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        f3.setForeground(new java.awt.Color(255, 255, 255));
        f3.setText("False");
        f3.setEnabled(false);
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });

        AreaQ3.setColumns(20);
        AreaQ3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ3.setRows(5);
        AreaQ3.setEnabled(false);
        jScrollPane4.setViewportView(AreaQ3);

        t3.setBackground(new java.awt.Color(0, 0, 102));
        q3.add(t3);
        t3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setText("True");
        t3.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Q1 :");

        f4.setBackground(new java.awt.Color(0, 0, 102));
        q4.add(f4);
        f4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        f4.setForeground(new java.awt.Color(255, 255, 255));
        f4.setText("False");
        f4.setToolTipText("");
        f4.setEnabled(false);
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
        t4.setToolTipText("");
        t4.setEnabled(false);
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Q3:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Q4:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextFieldSearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(t1)
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t2)
                            .addComponent(f2)
                            .addComponent(f1)
                            .addComponent(t3)
                            .addComponent(f3)
                            .addComponent(f4)
                            .addComponent(t4))
                        .addContainerGap(74, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(jTextFieldSearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 47, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(t1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f1))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(t2)
                                        .addGap(4, 4, 4)
                                        .addComponent(f2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(t3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
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

    private void jTextFieldSearchKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchKeyActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaQ1;
    private javax.swing.JTextArea AreaQ2;
    private javax.swing.JTextArea AreaQ3;
    private javax.swing.JTextArea AreaQ4;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton f1;
    private javax.swing.JRadioButton f2;
    private javax.swing.JRadioButton f3;
    private javax.swing.JRadioButton f4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
