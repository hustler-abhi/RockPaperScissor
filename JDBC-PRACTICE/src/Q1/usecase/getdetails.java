package Q1.usecase;

import java.util.List;
import java.util.Scanner;

import Q1.Dao.DaoInterface;
import Q1.Dao.Daoempl;
import Q1.model.StudentCourse;

public class getdetails {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("inter roll");
		int roll=sc.nextInt();
		
		DaoInterface dao=new Daoempl();
		
	List<StudentCourse>	list=dao.getDetailsbyroll(roll);
	
	 if(list.size()==0) {
		 System.out.println("record not found");
	 }else {
		 
		 list.forEach(s->System.out.println(s));
	 }
		
	}
}
