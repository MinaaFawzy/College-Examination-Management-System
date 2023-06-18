package Frames.Panels;

import FCIHCaseStudy.Course;
import FCIH_GUI.LoginFrame;
import static FCIH_GUI.LoginFrame.getUserName;
import Model.SQLQueries;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fady_
 */
public class AvailableExamPanel extends javax.swing.JPanel {

    public AvailableExamPanel() {
        initComponents();
        addRowsTojTable();

    }
    // this func to add the Student data in table
    public void addRowsTojTable() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        Object rowData[] = new Object[4];

        Course c = new Course();
        try {
            String username = getUserName();
            System.out.println(username);
            ResultSet resultSetFromStudent = SQLQueries.executeSelectQueryWithCondition("id", "student", "username='" + username + "'");
            int studentId = resultSetFromStudent.getInt("id");
            ResultSet resultSetFromStudentCourse = SQLQueries.executeSelectQueryWithoutCondition("*", "student_course");
            while (resultSetFromStudentCourse.next()) {
                if (studentId == resultSetFromStudentCourse.getInt("student_id") ) {
                    int courseId = resultSetFromStudentCourse.getInt("course_id");
                    ResultSet resultSetFromCourse = SQLQueries.executeSelectQueryWithCondition("*", "course", "id=" + courseId);
                    model.addRow(new Object[]{resultSetFromCourse.getString("course_name"), resultSetFromCourse.getInt("credit_hours"),
                        resultSetFromStudentCourse.getInt("grade")});
                }
            }
        } catch (SQLException exception) {
            System.out.println(exception);
        }

    }
//     public void addRowsTojTable() {
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        Object rowData[] = new Object[4];
//
//        Course c = new Course();
//        try {
//            ResultSet resultSetFromCourse =SQLQueries.executeSelectQueryWithoutCondition("*", "course");
//            while (resultSetFromCourse.next()) {
//                int deptId=resultSetFromCourse.getInt("dept_id");
//                ResultSet resultSetFromDept =SQLQueries.executeSelectQueryWithCondition("name", "department","id="+deptId);
//                model.addRow(new Object[]{resultSetFromCourse.getInt("id"), resultSetFromCourse.getString("course_name"),
//                    resultSetFromCourse.getInt("credit_hours"), resultSetFromDept.getString("name")});
//            }
//        } catch (SQLException exception) {
//            System.out.println(exception);
//        }
//
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        courseName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course Name");

        courseName.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setText("Enter Exam");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Name", "Credit Hours", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setToolTipText("");
        jTable2.setEnabled(false);
        jTable2.setShowGrid(true);
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(782, 782, 782)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(courseName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(235, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(courseName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //func to move the student to Exam jFrame
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!courseName.getText().equals("")) {
            try {
                ResultSet rs = SQLQueries.executeSelectQueryWithCondition("*", "course", "course_name='" + courseName.getText() + "'");
                int courseId = rs.getInt("id");
                String username = LoginFrame.getUserName();
                ResultSet res = SQLQueries.executeSelectQueryWithCondition("*", "student", "username='" + username + "'");
                int studentId = res.getInt("id");
                ResultSet rsFromStudentCourse=SQLQueries.executeSelectQueryWithCondition("*","student_course" ,"student_id = " + studentId + " AND course_id="+courseId+"" );
                int grade = rsFromStudentCourse.getInt("grade");
                System.out.println(grade);
                if (grade == -1) {
                    //this.setVisible(false);
                    new ExamForm(courseId).setVisible(true);
                } else {
                    Component b=null;
                    JOptionPane.showMessageDialog(b, "You are entered the exam before" );
                    int c=JOptionPane.OK_OPTION;
                }
            } catch (SQLException ex) {
                Logger.getLogger(AvailableExamPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField courseName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
