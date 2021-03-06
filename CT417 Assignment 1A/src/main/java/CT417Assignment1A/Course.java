
package CT417Assignment1A;

import java.util.ArrayList;
import org.joda.time.*;
/**
 *
 * @author Cian
 */
public class Course {

	private String CourseName;
	private ArrayList<Module> Modules;
        private ArrayList<Student> Students;
	private DateTime StartDate;
	private DateTime EndDate;

	public Course(String course, ArrayList modules, ArrayList students, DateTime start, DateTime end) {
            this.CourseName = course;
            this.Modules = modules;
            this.Students = students;
            this.StartDate = start;
            this.EndDate = end;
	}

	public String getCourseName() {
            return this.CourseName;
	}
	public void setCourseName(String course) {
            this.CourseName = course;
	}

	public ArrayList<Module> getModules() {
            return this.Modules;
	}
	public void setModules(ArrayList<Module> modules) {
            this.Modules = modules;
	}
        
        public ArrayList<Student> getStudents() {
            return this.Students;
        }
        public void setStudents(ArrayList<Student> students) {
            this.Students = students;
        }

	public DateTime getStartDate() {
            return this.StartDate;
	}
        public void setStartDate(DateTime start) {
            this.StartDate = start;
	}
	
        public DateTime getEndDate() {
            return this.EndDate;
	}
	public void setEndDate(DateTime end) {
            this.EndDate = end;
	}
        
        @Override
        public String toString() {
            String courseString = "\nCourse:\t" + this.CourseName + "\nStart Date:\t" + this.StartDate + "\nEnd Date:\t" + this.EndDate;

        if (this.Modules.size() > 0)
        {
            courseString += "\nModules:";
            for (Module module : this.Modules)
            {
                courseString += module.toString();
            }
        }

        return courseString;
    }
}
