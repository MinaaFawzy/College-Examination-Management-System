package FCIHCaseStudy;

import Model.ConnectDb;
import Model.SQLQueries;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fady_
 */
public class Student extends Person {

    private int level;
    private double GPA;


    public Student() {
        
    }

    public Student(String user, String pass, int id, String name,  int age, int level, double GPA, Department dept) {
        super(user, pass, id, name, age, dept);

        this.level = level;
        this.GPA = GPA;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getLevel() {
        return this.level;
    }

    public double getGPA() {
        return this.GPA;
    }

    public boolean addStudent() {
        SQLQueries.executeInsertQuery("student", id+",'"+userName+"','"+pass+"','"+name+"',"+GPA+","+myDept.getDeptID()+","+level+","+age);
        return true;
    }



    public Student searchStudentById(int id) {
        Student s=null;
        try {
            ResultSet rsFromStudent=SQLQueries.executeSelectQueryWithCondition("*", "student", "id="+id);
            ResultSet rsFromDepartment=SQLQueries.executeSelectQueryWithCondition("*", "department", "id="+rsFromStudent.getInt("dept_id"));
            myDept = new Department(rsFromDepartment.getInt("id"), rsFromDepartment.getString("name"));
            s = new Student(rsFromStudent.getString("username"), rsFromStudent.getString("password"),
                    rsFromStudent.getInt("id"),rsFromStudent.getString("name"),
                    rsFromStudent.getInt("age"),rsFromStudent.getInt("level"),
                    rsFromStudent.getFloat("gpa"), myDept);
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }


    public boolean updateStudent() {
        SQLQueries.executeUpdateQuerys("student set username", userName, id);
        SQLQueries.executeUpdateQuerys("student set password", pass, id);
        SQLQueries.executeUpdateQuerys("student set name", name, id);
        SQLQueries.executeUpdateQuerys("student set gpa", ""+GPA+"", id);
        SQLQueries.executeUpdateQuerys("student set dept_id", ""+myDept.getDeptID()+"", id);
        SQLQueries.executeUpdateQuerys("student set level", ""+level+"", id);
        SQLQueries.executeUpdateQuerys("student set age", ""+age+"", id);
        return true;
    }

    public boolean deleteStudent(int id) {
        SQLQueries.executeDeleteQuery("student", "id="+id);
        return true;
    }

    @Override
    public String toString() {
        return "\nI'm Eng : " + name + "\n" + "ID : " + id + " Age : " + age + "\n"
                + "Level : " + level + " GPA : " + GPA + "\nDept: " + myDept.getDeptName() + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

    public void study() {
        System.out.println("I'm Studying Undergraduate Courses @ FCIH :) ");
    }

    
    @Override
    public boolean login(String userName, String Pass) {
        try {
            ConnectDb c =new ConnectDb();
            ResultSet rs=SQLQueries.executeSelectQueryWithoutCondition("username,password", "student");
            
            while (rs.next()) {
                
                if (rs.getString("username").equals(userName) && rs.getString("password").equals(Pass)) {
                    return true;
                }
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }
}
