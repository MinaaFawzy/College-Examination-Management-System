
package FCIHCaseStudy;

import FCIH_GUI.LoginFrame;
import java.io.File;

/**
 *
 * @author fady_
 */
public class Main {

    public static Department cs = new Department(1, "CS");
    public static Department is = new Department(2, "IS");
    public static Department it = new Department(3, "IT");
    public static Department sw = new Department(4, "SW");

    public static void main(String[] args) {
        LoginFrame f = new LoginFrame();
        f.setVisible(true);
    }

 

}
