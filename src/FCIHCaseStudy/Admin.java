package FCIHCaseStudy;

import Model.ConnectDb;
import Model.SQLQueries;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fady_
 */
public class Admin extends Staff {

    private static Admin sAdmin = null;
    private Admin() {
    }

    private Admin(String user, String pass, int id, String name, int age, double salary, Department dept) {
        super(user, pass, id, name, age, salary, dept);
    }
    
    public static Admin getObject(){
        if (sAdmin == null){
            sAdmin =  new Admin();
        }
        return sAdmin;
    }

    public static Admin getFullObject(String user, String pass, int id, String name, int age, double salary, Department dept){
        if (sAdmin==null){
            sAdmin = new Admin(user, pass, id, name, age, salary, dept);
        }
        return sAdmin;
    }
    @Override
    public String toString() {
        return "I'm Manager : " + name + "\n" + "ID : " + id + " Age : " + age + " Salary : " + salary + "\n" + "Dept. : " + myDept.getDeptName() + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

    @Override
    public boolean login(String userName, String Pass) {
        boolean found = false;
        try {
            ConnectDb c =new ConnectDb();
            ResultSet rs=SQLQueries.executeSelectQueryWithoutCondition("username,password", "admin");

                while (rs.next()) {
                    if (rs.getString("username").equals(userName) && rs.getString("password").equals(Pass)) {
                        found = true;
                        return found;
                    }
                }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return found;
    }


}
