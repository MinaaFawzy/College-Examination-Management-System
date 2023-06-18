package FCIHCaseStudy;

import java.io.Serializable;

/**
 *
 * @author fady_
 */
public abstract class Staff extends Person implements Serializable {

    protected double salary;

    public Staff() {
    }

    public Staff(String user, String pass, int id, String name,  int age, double salary, Department dept) {
        super(user, pass, id, name, age, dept);
        this.salary = salary;
        this.myDept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDeptName() {
        return this.myDept.getDeptName();
    }

    
    @Override
    public boolean equals(Object o) {
        Staff u = (Staff) o;
        return id == u.id && name.equals(u.name) && age == u.age && salary == u.salary && myDept.getDeptName().equals(u.myDept.getDeptName());
    }

    @Override
    public abstract String toString();
}
