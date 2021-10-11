
package CT417Assignment1B;

import CT417Assignment1A.Student;
import CT417Assignment1A.Module;
import CT417Assignment1A.Course;
import org.joda.time.DateTime;
import java.util.ArrayList;
/**
 *
 * @author Cian
 */
public class Main {

    public static void main(String[] args) {
        
        Student s1, s2, s3, s4, s5;
        
        DateTime DOB1 = new DateTime(1999,8,16,0,0,0);
        s1 = new Student("Cian O'Boyle", 22, DOB1, 18427454);
        
        DateTime DOB2 = new DateTime(1998,5,9,0,0,0);
        s2 = new Student("Adam Holohan", 23, DOB2, 18437645);
        
        DateTime DOB3 = new DateTime(1999,9,11,0,0,0);
        s3 = new Student("Andrew McGee", 22, DOB3, 16794835);
        
        DateTime DOB4 = new DateTime(2000,12,2,0,0,0);
        s4 = new Student("Cathal Collins", 21, DOB4, 17348625);
        
        DateTime DOB5 = new DateTime(1999,4,24,0,0,0);
        s5 = new Student("Ben McDonald", 22, DOB5, 1752843);
        
        ArrayList<Student> csitStudents = new ArrayList<Student>();
        csitStudents.add(s1);
        csitStudents.add(s2);
        csitStudents.add(s3);
        
        ArrayList<Student> eceStudents = new ArrayList<Student>();
        eceStudents.add(s4);
        eceStudents.add(s5);
        
        ArrayList<Student> allStudents = new ArrayList<Student>();
        allStudents.add(s1);
        allStudents.add(s2);
        allStudents.add(s3);
        allStudents.add(s4);
        allStudents.add(s5);
        
        Module m1 = new Module("Software Engineering III", "CT417", csitStudents);
        Module m2 = new Module("Machine Learning", "CT4100", allStudents);
        Module m3 = new Module("ECE Module", "ECE401", eceStudents);
        
        ArrayList<Module> csitModules = new ArrayList<Module>();
        csitModules.add(m1);
        csitModules.add(m2);
        
        ArrayList<Module> eceModules = new ArrayList<Module>();
        eceModules.add(m2);
        eceModules.add(m3);
        
        DateTime start = new DateTime(2021,8,29,0,0,0);
        DateTime end = new DateTime(2022,5,30,0,0,0);
        
        Course CSIT = new Course("CSIT", csitModules, csitStudents, start, end);
        Course ECE = new Course("ECE", eceModules, eceStudents, start, end);
        
        System.out.println(CSIT);
        System.out.println(ECE);
        

    }
    
}
