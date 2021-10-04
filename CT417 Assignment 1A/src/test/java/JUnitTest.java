/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import org.joda.time.*;
import CT417Assignment1A.Student;
import CT417Assignment1A.Module;
import CT417Assignment1A.Course;

/**
 *
 * @author Cian
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void studentTest() {
         DateTime DOB = new DateTime(1999,8,16,0,0,0);
         Student s1 = new Student("Cian O'Boyle", 22, DOB, 18427454);
         
         assertEquals("Incorrect Name", "Cian O'Boyle", s1.getName());
         assertEquals("Incorrect Age", 22, s1.getAge());
         assertEquals("Incorrect DOB", DOB, s1.getDOB());
         assertEquals("Incorrect ID", 18427454, s1.getID());        
     }
     
     @Test
     public void studentUsernameTest() {
         DateTime DOB = new DateTime(1999,8,16,0,0,0);
         Student s1 = new Student("Cian O'Boyle", 22, DOB, 18427454);
         
         assertEquals("Incorrect Username", "Cian O'Boyle22", s1.getUsername());
     }
     
     @Test
     public void moduleTest(){
         DateTime DOB = new DateTime(1999,8,16,0,0,0);
         Student s1 = new Student("Cian O'Boyle", 22, DOB, 18427454);
         
         ArrayList<Student> students = new ArrayList<>();
         students.add(s1);
         
         Module m1 = new Module("Software Engineering III", "CT417", students);
         assertEquals("Incorrect Name", "Software Engineering III", m1.getModuleName());
         assertEquals("Incorrect ID", "CT417", m1.getModuleId());
         assertNotNull("No Students", m1.getStudents());
     }
     
     @Test
     public void courseTest(){
         DateTime DOB = new DateTime(1999,8,16,0,0,0);
         Student s1 = new Student("Cian O'Boyle", 22, DOB, 18427454);
         
         ArrayList<Student> students = new ArrayList<>();
         students.add(s1);
         
         Module m1 = new Module("Software Engineering III", "CT417", students);
         ArrayList<Module> modules = new ArrayList<>();
         modules.add(m1);
         
         DateTime start = new DateTime(2021,8,29,0,0,0);
         DateTime end = new DateTime(2022,5,30,0,0,0);
         
         Course course = new Course("CSIT", modules, students, start, end);
         assertEquals("Incorrect Name", "CSIT", course.getCourseName());
         assertNotNull("No Modules", course.getModules());
         assertNotNull("No Students", course.getStudents());
         assertNotNull("No Start Date", course.getStartDate());
         assertNotNull("No End Date", course.getEndDate());
     }
}
