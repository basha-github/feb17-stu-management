import java.util.Scanner;

public class StudentResults {

	public static void main(String[] args) {
	
		
		StudentManagementImpl stuMang = new StudentManagementImpl();
		
		//Student ramu = new Student(123,"Ramu",'A',"CSE",67000);
		//Student abdul = new Student(124,"Abdul",'B',"IT",87000);
		//Student john = new Student(125,"John",'C',"CSE",97000);
		
		//stuMang.addStudent(ramu);
		//stuMang.addStudent(abdul);
		//stuMang.addStudent(john);
		
		
		//stuMang.displayAll();
		
		Scanner sc = new Scanner(System.in);
		String res;
		do {
			System.out.println("Menu");
			System.out.println("----------");
			System.out.println("1.Add Student");
			System.out.println("2. display All Students");
			System.out.println("3.Remove Student");
			System.out.println("4.search Student");
			System.out.println("enter choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:  
				
				createStudent(sc,stuMang);
				break;
			case 2:   stuMang.displayAll();break;
			case 3:   stuMang.deleteStudent(123);break;
			case 4:   stuMang.searchStudent(123);break;
			
			}
			
			System.out.println("do u want to repeat?");
			res = sc.next();
			res = res.toLowerCase();
			
			
		}while(res.contentEquals("y"));
		
		System.out.println("Program Ends");
			
	}

	private static void createStudent(Scanner sc,
			StudentManagementImpl stuMang) {
		//Student ramu = new Student(123,"Ramu",'A',"CSE",67000);
		System.out.println("enter roll no");
		int rollNo = sc.nextInt(); 
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter grade");
		char g = sc.next().charAt(0); 
		System.out.println("entere course");
		String course = sc.next();
		System.out.println("enter fee");
		int fee = sc.nextInt();
		
		Student stu = new Student(rollNo,name,g,course,fee);
		stuMang.addStudent(stu);
		
	}

}
