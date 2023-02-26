package Q1.Dao;
import java.util.*;
import Q1.model.Course;
import Q1.model.Student;
import Q1.model.StudentCourse;

public interface DaoInterface {
	
	public String insertIntoStudent(Student s);
	
	public String insertIntoCourse(Course c);
	
	public List<StudentCourse> getDetailsbyroll(int roll);
	public List<StudentCourse> getDetailsbycourse(String course);
	
}
