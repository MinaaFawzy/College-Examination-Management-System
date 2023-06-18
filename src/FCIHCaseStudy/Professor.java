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
public class Professor extends Staff implements Serializable {

    private int officeHours;

    private final String professorFileName = "Professor.bin";

    public static ArrayList<Professor> Professors = new ArrayList<Professor>();

    public Professor() {
    }

    public Professor(String user, String pass, int id, String name, int age, double salary, int officeHours, Department dept) {
        super(user, pass, id ,name, age, salary, dept);

        this.officeHours = officeHours;
    }

    public void setOfficeHours(int h) {
        this.officeHours = h;
    }

    public int getOfficeHours() {
        return this.officeHours;
    }

    public boolean addProf() {
        SQLQueries.executeInsertQuery("professor", id+",'"+name+"','"+userName+"','"+pass+"',"+age+","+myDept.getDeptID()+","+officeHours+","+salary);
        return true;
    }



    private int getProfIndex(int id) {
        for (int i = 0; i < Professors.size(); i++) {
            if (Professors.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }

    public Professor searchProfById(int id) {
        Professor s=null;
        try {
            ResultSet rsFromProfessor=SQLQueries.executeSelectQueryWithCondition("*", "professor", "id="+id);
            ResultSet rsFromDepartment=SQLQueries.executeSelectQueryWithCondition("*", "department", "id="+rsFromProfessor.getInt("dept_id"));
            myDept = new Department(rsFromDepartment.getInt("id"), rsFromDepartment.getString("name"));
            s = new Professor(rsFromProfessor.getString("username"), rsFromProfessor.getString("password"),
                    rsFromProfessor.getInt("id"),rsFromProfessor.getString("name"),
                    rsFromProfessor.getInt("age"),rsFromProfessor.getInt("salary"),
                    rsFromProfessor.getInt("office_hour"), myDept);
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }


    public boolean updateProf() {
        SQLQueries.executeUpdateQuerys("professor set username", userName, id);
        SQLQueries.executeUpdateQuerys("professor set password", pass, id);
        SQLQueries.executeUpdateQuerys("professor set name", name, id);
        SQLQueries.executeUpdateQuerys("professor set salary", ""+salary+"", id);
        SQLQueries.executeUpdateQuerys("professor set dept_id", ""+myDept.getDeptID()+"", id);
        SQLQueries.executeUpdateQuerys("professor set office_hour", ""+officeHours+"", id);
        SQLQueries.executeUpdateQuerys("professor set age", ""+age+"", id);
        return true;
    }

    public boolean deleteProf(int id) {
        SQLQueries.executeDeleteQuery("professor", "id="+id);
        return true;
    }

    @Override
    public String toString() {
        return "\nI'm Prof : " + name  + "\n" + "ID : " + id + " Age : " + age + " Salary : " + officeHours + "\n" + "Dept. : " + myDept.getDeptName() + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

    public void teach() {
        System.out.println("I'm Teaching all Lectures !");
    }

    @Override
    public boolean login(String userName, String Pass) {
        try {
            ConnectDb c =new ConnectDb();
            ResultSet rs=SQLQueries.executeSelectQueryWithoutCondition("username,password","professor");
            while(rs.next()){
                if(rs.getString("username").equals(userName)&&rs.getString("password").equals(Pass)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }
}
