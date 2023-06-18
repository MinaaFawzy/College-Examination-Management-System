
package Frames.Panels;

import Model.SQLQueries;
import FCIHCaseStudy.Main;
import FCIHCaseStudy.Professor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 *@author marina
 */
public class Prof_ListPanel extends javax.swing.JPanel {


    public Prof_ListPanel() {
        initComponents();
        addRowsTojTable();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_add = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 102));

        table_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        table_add.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Username", "Password", "Age", "Salary", "Office Hours", "Dept"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_add.setEnabled(false);
        table_add.setRowHeight(25);
        jScrollPane1.setViewportView(table_add);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addRowsTojTable() {
        DefaultTableModel model = (DefaultTableModel) table_add.getModel();
        Object rowData[] = new Object[9];

        Professor prof = new Professor();
        ArrayList<Professor> professors = new ArrayList<Professor>();
        
        try {
            ResultSet resultSetFromProfessor =SQLQueries.executeSelectQueryWithoutCondition("*", "professor");
            while (resultSetFromProfessor.next()) {
                int deptId=resultSetFromProfessor.getInt("dept_id");
                ResultSet resultSetFromDept =SQLQueries.executeSelectQueryWithCondition("name", "department","id="+deptId);
                model.addRow(new Object[]{resultSetFromProfessor.getInt("id"), resultSetFromProfessor.getString("name"),
                    resultSetFromProfessor.getString("username"),resultSetFromProfessor.getString("password"),
                    resultSetFromProfessor.getInt("age"),resultSetFromProfessor.getInt("salary"),
                    resultSetFromProfessor.getInt("office_hour"),resultSetFromDept.getString("name")});
            }
        } catch (SQLException exception) {
            System.out.println(exception);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_add;
    // End of variables declaration//GEN-END:variables
}
