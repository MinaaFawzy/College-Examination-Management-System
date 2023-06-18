package FCIHCaseStudy;

import java.io.Serializable;

/**
 *
 * @author fady_
 */
public class Department implements Serializable {

    private int DeptID;
    private String DeptName;

    public Department() {

    }
    public Department(int DeptID, String DeptName) {
        this.DeptID = DeptID;
        this.DeptName = DeptName;
    }

    public void setDeptID(int DeptID) {
        this.DeptID = DeptID;
    }

    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    public int getDeptID() {
        return this.DeptID;
    }

    public String getDeptName() {
        return this.DeptName;
    }

}
