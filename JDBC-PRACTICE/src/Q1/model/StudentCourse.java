package Q1.model;

public class StudentCourse {
	private int roll;
	private String sname;
	private int cid;
	private String cname;
	public StudentCourse(int roll, String sname, int cid, String cname) {
		super();
		this.roll = roll;
		this.sname = sname;
		this.cid = cid;
		this.cname = cname;
	}
	public StudentCourse() {
		
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "StudentCourse [roll=" + roll + ", sname=" + sname + ", cid=" + cid + ", cname=" + cname + "]";
	}
	

}
