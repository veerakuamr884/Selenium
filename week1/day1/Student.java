package week1.day1;

public class Student {

		String studentName="Ajay";
		int rollNo=12;
		String collegeName="Anna Univercity";
		int markScored=85;
		float cgpa=7.5f;
		
	public void studentName() {
		System.out.println("ajay");
	}
	public void rollNo() {
		System.out.println("12");
	}
	public void collegeName() {
		System.out.println("Anna Univercity");
	}
	public void markScored() {
		System.out.println("85");
	}
	public void cgpa() {
		System.out.println("7.5f");
	}
	public static void main(String[] args) {
		Student det=new Student();
		det.studentName();
		det.rollNo();
		det.collegeName();
		det.markScored();
		det.cgpa();
		
	}
}
