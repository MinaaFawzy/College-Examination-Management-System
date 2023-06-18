
package Frames.Panels;

import FCIHCaseStudy.Exam;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author fady_
 */
public class Exam_panal extends javax.swing.JPanel {
int id;
    public Exam_panal(int id) {
        initComponents();
                this.id=id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        q1 = new javax.swing.ButtonGroup();
        q2 = new javax.swing.ButtonGroup();
        q3 = new javax.swing.ButtonGroup();
        q4 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaQ1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaQ4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaQ2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        AreaQ3 = new javax.swing.JTextArea();
        AddExam = new javax.swing.JButton();
        JLableFailOrSucceeded = new javax.swing.JLabel();
        t1 = new javax.swing.JRadioButton();
        f1 = new javax.swing.JRadioButton();
        f2 = new javax.swing.JRadioButton();
        t2 = new javax.swing.JRadioButton();
        f3 = new javax.swing.JRadioButton();
        t3 = new javax.swing.JRadioButton();
        f4 = new javax.swing.JRadioButton();
        t4 = new javax.swing.JRadioButton();

        jLabel7.setText("jLabel7");

        jRadioButton1.setText("jRadioButton1");

        setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Q1 :");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Q2 :");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Q3:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Q4:");

        AreaQ1.setColumns(20);
        AreaQ1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ1.setRows(5);
        jScrollPane1.setViewportView(AreaQ1);

        AreaQ4.setColumns(20);
        AreaQ4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ4.setRows(5);
        jScrollPane2.setViewportView(AreaQ4);

        AreaQ2.setColumns(20);
        AreaQ2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ2.setRows(5);
        jScrollPane3.setViewportView(AreaQ2);

        AreaQ3.setColumns(20);
        AreaQ3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AreaQ3.setRows(5);
        jScrollPane4.setViewportView(AreaQ3);

        AddExam.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AddExam.setText("Submit");
        AddExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddExamActionPerformed(evt);
            }
        });

        JLableFailOrSucceeded.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        JLableFailOrSucceeded.setForeground(new java.awt.Color(255, 255, 255));

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

        t3.setBackground(new java.awt.Color(0, 0, 102));
        q3.add(t3);
        t3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setText("True");

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

        t4.setBackground(new java.awt.Color(0, 0, 102));
        q4.add(t4);
        t4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setText("True");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(AddExam, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(JLableFailOrSucceeded, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1)
                            .addComponent(f1)
                            .addComponent(t2)
                            .addComponent(f2)
                            .addComponent(t3)
                            .addComponent(f3)
                            .addComponent(t4)
                            .addComponent(f4))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(JLableFailOrSucceeded, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(t2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(f2)
                        .addGap(4, 4, 4))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(t3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(f3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f4)))
                .addGap(23, 23, 23)
                .addComponent(AddExam, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents
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
    
    private void AddExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddExamActionPerformed
        // TODO add your handling code here:

        if (!AreaQ1.getText().equals("") && !AreaQ2.getText().equals("")
                && !AreaQ3.getText().equals("") && !AreaQ4.getText().equals("")
                && getSelectedOption(q1) != null && getSelectedOption(q2) != null
                && getSelectedOption(q3) != null && getSelectedOption(q4) != null) {
            Exam e = new Exam();
            e.setEId(this.id);
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
            if (e.addExam()) {
                JLableFailOrSucceeded.setText("Exam added successfuly");
                resetPanalData();
            } else {
                JLableFailOrSucceeded.setText("Failed to Add Exam... !");
            }
        } else {
            JLableFailOrSucceeded.setText("Missing required Fields ... !  Please, complete them before submit ...!");
        }
    }//GEN-LAST:event_AddExamActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f2ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f3ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f4ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f1ActionPerformed

    protected void resetPanalData() {
        AreaQ1.setText("");
        AreaQ2.setText("");
        AreaQ3.setText("");
        AreaQ4.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddExam;
    private javax.swing.JTextArea AreaQ1;
    private javax.swing.JTextArea AreaQ2;
    private javax.swing.JTextArea AreaQ3;
    private javax.swing.JTextArea AreaQ4;
    private javax.swing.JLabel JLableFailOrSucceeded;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton f1;
    private javax.swing.JRadioButton f2;
    private javax.swing.JRadioButton f3;
    private javax.swing.JRadioButton f4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
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
