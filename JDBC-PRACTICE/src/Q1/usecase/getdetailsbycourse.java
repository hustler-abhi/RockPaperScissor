package Q1.usecase;

import java.util.List;
import java.util.Scanner;

import Q1.Dao.DaoInterface;
import Q1.Dao.Daoempl;
import Q1.model.StudentCourse;

public class getdetailsbycourse {
	
	public static void main(String[] args) {
		
		
	Scanner sc=new Scanner(System.in);
		
		
		System.out.println("inter course");
		String c=sc.next();
		
		DaoInterface dao=new Daoempl();
		
	List<StudentCourse>	list=dao. getDetailsbycourse(c);
	
	 if(list.size()==0) {
		 System.out.println("record not found");
	 }else {
		 
		 list.forEach(s->System.out.println(s));
	 }
	}

}
