package FCIHCaseStudy;

import static Model.ConnectDb.getConnection;
import Model.SQLQueries;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fady_
 */
public final class Course {

    private String CName;
    private int CId;
    private int CreditHours;

    public Department dept = Main.cs;


    public Course() {
    }

    public Course(String Cname, int CId, int CreditHours, Department dept) {
        this.CName = Cname;
        this.CId = CId;
        this.CreditHours = CreditHours;

        this.dept = dept;
//        finalExame.addExam();
    }
    public void addCourse(String Cname, int CId, int CreditHours, int deptId){
        SQLQueries.executeInsertQuery("course", CId+",'"+Cname+"',"+CreditHours+","+deptId);
    }

    public void setCId(int Id) {
        this.CId = Id;
    }

    public void setCname(String name) {
        this.CName = name;
    }

    public void setCreditHours(int CreditHours) {
        this.CreditHours = CreditHours;
    }

    public int getCId() {
        return this.CId;
    }

    public String getCname() {
        return this.CName;
    }

    public int getCreditHours() {
        return this.CreditHours;
    }

    public void setDept(Department d) {
        this.dept = d;
    }


    public Course searchCourseById(int id) {
        Course c=null;
        try {
            ResultSet rsFromCourse=SQLQueries.executeSelectQueryWithCondition("*", "course", "id="+id);
            ResultSet rsFromDepartment=SQLQueries.executeSelectQueryWithCondition("*", "department", "id="+rsFromCourse.getInt("dept_id"));
            dept=new Department(rsFromDepartment.getInt("id"), rsFromDepartment.getString("name"));
            c=new Course(rsFromCourse.getString("course_name"), rsFromCourse.getInt("id"), rsFromCourse.getInt("credit_hours"), dept);
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }


    public boolean updateCourse() {
        SQLQueries.executeUpdateQuerys("course set course_name", CName, CId);
        SQLQueries.executeUpdateQuerys("course set credit_hours", ""+CreditHours+"", CId);
        SQLQueries.executeUpdateQuerys("course set dept_id", ""+dept.getDeptID()+"", CId);
        return true;
    }

    public boolean deleteCourse(int id) {
        SQLQueries.executeDeleteQuery("course", "id="+id);
        return true;
    }

}
