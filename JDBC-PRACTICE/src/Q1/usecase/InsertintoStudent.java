package Q1.usecase;

import java.util.Scanner;

import Q1.Dao.DaoInterface;
import Q1.Dao.Daoempl;
import Q1.model.Student;

public class InsertintoStudent {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter student roll");
		int roll=sc.nextInt();
		
		System.out.println("enter student name");
		String name=sc.next();
		
		System.out.println("enter student address");
		String address=sc.next();
		
		System.out.println("enter student mobile");
		String mobile=sc.next();
		
		DaoInterface dao=new Daoempl();
		
		Student s=new Student(roll,name,address,mobile);
		
		String msg=dao.insertIntoStudent(s);
		
		System.out.println(msg);
		
		
		
		
		
	}

}
