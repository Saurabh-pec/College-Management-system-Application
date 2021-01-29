package collegemangementsystem;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author kishor
 */
public class CollegeMangementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" JDBC Start ");
        
        System.out.println("Programis running on gui...");
        HomePage hp = new HomePage();
        hp.setVisible(true);
    }

}
