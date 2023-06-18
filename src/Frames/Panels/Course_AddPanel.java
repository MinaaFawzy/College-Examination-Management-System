
package Frames.Panels;

import Model.SQLQueries;
import FCIHCaseStudy.Course;
import FCIHCaseStudy.Department;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *@author fady_
 */
public class Course_AddPanel extends javax.swing.JPanel {


    public Course_AddPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCname = new javax.swing.JTextField();
        jLabelSucessOrFail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCreditHours = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxDept = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        jLabelSucessOrFail1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 102));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course ID");

        jTextFieldID.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Course Name");

        jTextFieldCname.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N

        jLabelSucessOrFail.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabelSucessOrFail.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Credit Hours");

        jTextFieldCreditHours.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Department");

        jComboBoxDept.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jComboBoxDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "IS", "IT", "SW" }));

        btnSubmit.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        btnSubmit.setText("Proceed");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabelSucessOrFail1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabelSucessOrFail1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSucessOrFail1.setText("Add New Course... !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCreditHours, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldCname, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBoxDept, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSucessOrFail1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabelSucessOrFail1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCreditHours, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDept, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(40, 40, 40)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        boolean success=false;
        if (!jTextFieldID.getText().equals("") && !jTextFieldCname.getText().equals("") && !jTextFieldCreditHours.getText().equals("")) {

            Department dept = null;

            if (jComboBoxDept.getSelectedItem().equals("CS")) {
                try {
                    ResultSet rs=SQLQueries.executeSelectQueryWithCondition("*", "department", "name='CS'");
                    System.out.println("hhhhhhhhhhhhhhhhhhhhh");
                    System.out.println(rs.getInt("id"));
                    dept=new Department(rs.getInt("id"), rs.getString("name"));
                    System.out.println(dept.getDeptID());
                } catch (SQLException ex) {
                    Logger.getLogger(Course_AddPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (jComboBoxDept.getSelectedItem().equals("IS")) {
                try {
                    ResultSet rs=SQLQueries.executeSelectQueryWithCondition("*", "department", "name='IS'"); 
                    dept=new Department(rs.getInt("id"), rs.getString("name"));
                } catch (SQLException ex) {
                    Logger.getLogger(Course_AddPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (jComboBoxDept.getSelectedItem().equals("IT")) {
                try {
                    ResultSet rs=SQLQueries.executeSelectQueryWithCondition("*", "department", "name='IT'");
                    dept=new Department(rs.getInt("id"), rs.getString("name"));
                } catch (SQLException ex) {
                    Logger.getLogger(Course_AddPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (jComboBoxDept.getSelectedItem().equals("SW")) {
                try {
                    ResultSet rs=SQLQueries.executeSelectQueryWithCondition("*", "department", "name='SW'");
                    dept=new Department(rs.getInt("id"), rs.getString("name"));
                } catch (SQLException ex) {
                    Logger.getLogger(Course_AddPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
            Course x = new Course(jTextFieldCname.getText(), Integer.parseInt(jTextFieldID.getText()), Integer.parseInt(jTextFieldCreditHours.getText()), dept);
             x.addCourse(jTextFieldCname.getText(),Integer.parseInt(jTextFieldID.getText()), Integer.parseInt(jTextFieldCreditHours.getText()), dept.getDeptID());
            success=true;
            if (success) {
                jLabelSucessOrFail.setText("Added Successfully ... !");
                resetPanelData();
            } else {
                jLabelSucessOrFail.setText("Failed to insert ... !");
            }
            
        } else {
            jLabelSucessOrFail.setText("Missing required Fields ... !");
            jLabelSucessOrFail1.setText("Please Complete before submit ...!");
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    protected void resetPanelData() {
        jTextFieldID.setText("");
        jTextFieldCname.setText("");
        jTextFieldCreditHours.setText("");
        jComboBoxDept.setSelectedIndex(0);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> jComboBoxDept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSucessOrFail;
    private javax.swing.JLabel jLabelSucessOrFail1;
    private javax.swing.JTextField jTextFieldCname;
    private javax.swing.JTextField jTextFieldCreditHours;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
