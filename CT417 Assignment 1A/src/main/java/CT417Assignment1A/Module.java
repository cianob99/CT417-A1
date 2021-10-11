
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
            String moduleString = "\n\tName:\t" + this.ModuleName + "\n\tCode:\t" + this.ModuleID;

        if (this.Students.size() > 0)
        {
            moduleString += "\n\tStudents:";
            for (Student student : this.Students)
            {
                moduleString += student.toString();
            }
        }
        return moduleString;
        }
}
