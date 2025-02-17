
public class StudentResults {

	public static void main(String[] args) {
	
		
		StudentManagementImpl stuMang = new StudentManagementImpl();
		
		Student ramu = new Student(123,"Ramu",'A',"CSE",67000);
		Student abdul = new Student(124,"Abdul",'B',"IT",87000);
		Student john = new Student(125,"John",'C',"CSE",97000);
		
		stuMang.addStudent(ramu);
		stuMang.addStudent(abdul);
		stuMang.addStudent(john);
		
		
		stuMang.displayAll();
		
		
		
		
	}

}
