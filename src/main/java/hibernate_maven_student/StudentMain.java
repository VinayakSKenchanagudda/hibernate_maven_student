package hibernate_maven_student;

import java.util.Scanner;

public class StudentMain {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	StudentCURD curd=new StudentCURD();
	boolean repeat=true;
	while(repeat)
	{
		System.out.println("Enter the choice \n 1.saveStudent \n 2.update \n 3.delete \n 4.GetStudent deatails \n 5.exit");
		int choice=scanner.nextInt();
		switch (choice) {
		case 1:
		{
			System.out.println("Enter the student id");
			int id=scanner.nextInt();
			System.out.println("Enter the name");
			String name=scanner.next();
			System.out.println("Enter the father name");
			String fathername=scanner.next();
			System.out.println("Enter the mother name");
			String mothername=scanner.next();
			System.out.println("Enter the address");
			String address=scanner.next();
			System.out.println("Enter the total marks");
			int totalMarks=scanner.nextInt();
			System.out.println("Enter the percentage");
			double percentage=scanner.nextDouble();
			
			Student student =new Student();
			student.setId(id);
			student.setName(name);
			student.setFathername(fathername);
			student.setMothername(mothername);
			student.setMothername(mothername);
			student.setTotalmarks(totalMarks);
			student.setPercentage(percentage);
			student.setAddress(address);
			curd.saveStudent(student);
			System.out.println("saved student details sucessfully");
		}break;
		case 2:{
			System.out.println("Enter the student id");
			int id=scanner.nextInt();
			System.out.println("Enter the new name to update");
			String name=scanner.next();
			curd.updateStudent(id, name);
			System.out.println("updated sucessfully");
		}break;
		case 3:{
			System.out.println("Enter the student id to delete");
			int id=scanner.nextInt();
			curd.deletStudent(id);
			System.out.println("Deleted sucessfully");
		}break;
		case 4:{
			System.out.println("Enter the student id to get details");
			int id=scanner.nextInt();
			curd.getStudentDetails(id);
		}break;
		case 5:repeat=false;
		System.out.println("ThankYou");break;
		
		default:
		{
			System.out.println("invalid choice");
		}
			break;
		}
	}

}
}
