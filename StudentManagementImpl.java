import java.util.ArrayList;
import java.util.List;

public class StudentManagementImpl  implements StudentManagement{
	
	//Student[] stuArray = new Student[100];
	//int index=-1;
	
	
	ArrayList<Student> stuList = new ArrayList<Student>();
	
	

	@Override
	public void addStudent(Student stu) {
		//stuArray[++index] =stu;// 0
		
		stuList.add(stu);
		
		
	}

	@Override
	public void deleteStudent(int rollNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student searchStudent(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> displayAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
