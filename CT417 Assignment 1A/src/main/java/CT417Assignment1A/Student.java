/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CT417Assignment1A;

import java.util.ArrayList;
import org.joda.time.*;
/**
 *
 * @author Cian
 */
public class Student {
    private String Name;
    private int Age;
    private DateTime DOB;
    private int ID;
    
    public Student(String name, int age, DateTime dob, int id)
	{
            this.Name = name;
            this.Age = age;
            this.DOB = dob;
            this.ID = id;
	}
	
	public String getName() {
            return this.Name;
	}
        public void setName(String name) {
            Name = name;
        }
	
	public int getAge() {
            return this.Age;
	}
        public void getAge(int age) {
            Age = age;
        }
	
	public DateTime getDOB() {
            return this.DOB;
	}
        public void setDOB(DateTime dob) {
            DOB = dob;
        }

	public int getID() {
            return this.ID;
	}
        public void setID(int id) {
            ID = id;
        }
	
	public String getUsername() {
            return getName() + getAge();
	}
}
