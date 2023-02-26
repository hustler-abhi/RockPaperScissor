package Q1.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Q1.UTILITY.DBUTILL;
import Q1.model.Course;
import Q1.model.Student;
import Q1.model.StudentCourse;

public class Daoempl implements DaoInterface{

	@Override
	public String insertIntoStudent(Student s) {
		// TODO Auto-generated method stub
		String msg="not inserted";
		try(Connection con=DBUTILL.provideConnection()) {
			
		PreparedStatement ps=	con.prepareStatement("insert into student values(?,?,?,?)");
		
		ps.setInt(1, s.getRoll());
		ps.setString(2, s.getName());
		ps.setString(3, s.getAddress());	
		ps.setString(4, s.getMobile());
		
		int i=ps.executeUpdate();
		if(i>0) {
			msg="inserted";
		}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			// TODO: handle exceptionge
		}
		
		
		
		
		
		return msg;
	}

	@Override
	public String insertIntoCourse(Course c) {
		// TODO Auto-generated method stub
		
		String msg="not inserted";
		try(Connection con=DBUTILL.provideConnection()) {
			
		PreparedStatement ps=	con.prepareStatement("insert into course values(?,?,?,?)");
		
		ps.setInt(1, c.getCid());
		ps.setString(2, c.getCname());
		ps.setInt(3, c.getFee());	
		ps.setString(4, c.getDuration());
		
		int i=ps.executeUpdate();
		if(i>0) {
			msg="inserted";
		}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			// TODO: handle exceptionge
		}
		
		
		
		
		
		return msg;
	
	}

	@Override
	public List<StudentCourse> getDetailsbyroll(int roll) {
		
		List<StudentCourse>list=new ArrayList();
		
		
		try(Connection con=DBUTILL.provideConnection()) {
			
		PreparedStatement ps=	con.prepareStatement("select s.roll,s.name,c.cid,c.cname from student s,course c,student_course sc where sc.roll=s.roll and c.cid=sc.cid and s.roll=?");
		
		ps.setInt(1, roll);
		
ResultSet rs=ps.executeQuery();

    while(rs.next()) {
    	
    	int rol=rs.getInt("s.roll");
    	String name=rs.getString("s.name");
    	int cid=rs.getInt("c.cid");
    	String cname=rs.getString("c.cname");
    	
    	StudentCourse sc=new StudentCourse(rol,name,cid,cname);
    	
    	list.add(sc);
    	
    	
    }
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public List<StudentCourse> getDetailsbycourse(String course) {
		// TODO Auto-generated method stub
		
		List<StudentCourse>list=new ArrayList();
		
		
		try(Connection con=DBUTILL.provideConnection()) {
			
		PreparedStatement ps=	con.prepareStatement("select s.roll,s.name,c.cid,c.cname from student s,course c,student_course sc where sc.roll=s.roll and c.cid=sc.cid and c.cname=?");
		
		ps.setString(1, course);
		
ResultSet rs=ps.executeQuery();

    while(rs.next()) {
    	
    	int rol=rs.getInt("s.roll");
    	String name=rs.getString("s.name");
    	int cid=rs.getInt("c.cid");
    	String cname=rs.getString("c.cname");
    	
    	StudentCourse sc=new StudentCourse(rol,name,cid,cname);
    	
    	list.add(sc);
    	
    	
    }
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		
		// TODO Auto-generated method stub
		return list;
		 
	}
	

}
