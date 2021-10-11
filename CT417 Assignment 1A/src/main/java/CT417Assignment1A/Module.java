/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CT417Assignment1A;

import java.util.ArrayList;
/**
 *
 * @author Cian
 */
public class Module {

	private String ModuleName;
	private String ModuleID;
	private ArrayList<Student> Students;

	public Module(String moduleName, String id, ArrayList students) {
            this.ModuleName = moduleName;
            this.ModuleID = id;
            this.Students = students;
	}

	public String getModuleName() {
            return this.ModuleName;
	}
        public void setModuleName(String moduleName) {
            this.ModuleName = moduleName;
        }

	public String getModuleId() {
            return this.ModuleID;
	}
        public void setModuleId(String id) {
            this.ModuleID = id;
        }

	public ArrayList<Student> getStudents() {
            return this.Students;
	}

	public void setStudents(ArrayList<Student> students) {
            this.Students = students;
	}
        
        @Override
        public String toString() {
            String moduleString = "\nModule Name:\t" + this.ModuleName + "\nModule ID:\t" + this.ModuleID;

        if (this.Students.size() > 0)
        {
            moduleString += "\nModules:";
            for (Student student : this.Students)
            {
                moduleString += student.toString();
            }
        }

        return moduleString;
        }
}
