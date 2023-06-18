package FCIHCaseStudy;

import java.io.Serializable;

/**
 *
 * @author fady_
 */
public abstract class Person implements Serializable {

    public int id;
    protected String userName;
    protected String pass;
    protected String name;
    protected int age;
    public Department myDept = Main.cs;  


    public Person() {
    }

    public Person(String user, String pass, int id, String name,int age, Department dept) {
           
        this.id = id;
        this.name = name;
        this.age = age;
        this.userName = user;
        this.pass = pass;
        this.myDept = dept;
    }

    @Override
    public abstract String toString();

    //setter
    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setDept(Department dept) {
        this.myDept = dept;
    }

    
    public String getuserName() {
        return this.userName;
    }

    public String getPass() {
        return this.pass;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public abstract boolean login(String userName, String Pass);
}
