import java.util.List;

public interface StudentManagement {
	
	
	void addStudent(Student stu);
	
	void deleteStudent(int rollNo);
	
	Student searchStudent(int rollNo);
	
	List<Student> displayAll();
	

}
