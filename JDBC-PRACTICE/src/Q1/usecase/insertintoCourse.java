package Q1.usecase;

import java.util.Scanner;

import Q1.Dao.DaoInterface;
import Q1.Dao.Daoempl;
import Q1.model.Course;
import Q1.model.Student;

public class insertintoCourse {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.println("enter course cid");
		int roll=sc.nextInt();
		
		System.out.println("enter course cname");
		String name=sc.next();
		
		System.out.println("enter course fee");
		int address=sc.nextInt();
		
		System.out.println("enter course Duration");
		String mobile=sc.next();
		
		DaoInterface dao=new Daoempl();
		
		 
		
		String msg=dao. insertIntoCourse( new Course(roll, name, address, mobile));
		
		System.out.println(msg);
	}
}
