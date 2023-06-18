package FCIHCaseStudy;

import Model.SQLQueries;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fady_
 */
public class Exam implements Serializable {

    int EId;
    private String q1 , q2 , q3 , q4,a1,a2,a3,a4;

    public Exam() {

    }

    public Exam( int EId ,String q1 , String q2 , String q3 , String q4,String a1 , String a2 , String a3 , String a4) {
        this.EId = EId;
        this.q1=q1 ; 
        this.q2=q2 ;
        this.q3=q3;
        this.q4=q4;
        this.a1=a1 ; 
        this.a2=a2 ;
        this.a3=a3;
        this.a4=a4;
                
    }

    public void setEId(int EId) {
        this.EId = EId;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }
    
    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }
    
    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }


    public int getEId() {
        return this.EId;
    }


    public boolean addExam() {
        SQLQueries.executeInsertQuery("exam", EId+",'"+q1+"','"+a1+"','"+q2+"','"+a2+"','"+q3+"','"+a3+"','"+q4+"','"+a4+"'");
        return true;
    }

    public Exam searchExamById(int id) {
        Exam e=null;
        try {
            ResultSet rsFromExam=SQLQueries.executeSelectQueryWithCondition("*", "exam", "id="+id);
            e = new Exam(rsFromExam.getInt("id"), rsFromExam.getString("q1"),
                    rsFromExam.getString("q2"),rsFromExam.getString("q3"),
                    rsFromExam.getString("q4"),rsFromExam.getString("a1"),
                    rsFromExam.getString("a2"),rsFromExam.getString("a3"),
                    rsFromExam.getString("a4"));
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }
    
      public boolean updateExam() {
        SQLQueries.executeUpdateQuerys("exam set q1", q1, EId);
        SQLQueries.executeUpdateQuerys("exam set q2", q2, EId);
        SQLQueries.executeUpdateQuerys("exam set q3", q3, EId);
        SQLQueries.executeUpdateQuerys("exam set q4", q4, EId);
        SQLQueries.executeUpdateQuerys("exam set a1", a1 ,EId);
        SQLQueries.executeUpdateQuerys("exam set a2", a2, EId);
        SQLQueries.executeUpdateQuerys("exam set a3", a3, EId);
        SQLQueries.executeUpdateQuerys("exam set a4", a4, EId);
        return true;
    }
      
    public boolean deleteExam(int id) {
        SQLQueries.executeDeleteQuery("exam", "id="+id);
        return true;
    }

}
