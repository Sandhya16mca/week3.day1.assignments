package week3.day1.assignments;

public class Student  {
	public void StudentName() {
		System.out.println("Sandhya Ravichandran");}
	public void Studentdept() {
		System.out.println("Master of Computer Application");}
	public void StudentId() {
		System.out.println("Id is 101");
	}
	public static void main(String[]args) {
		College college= new College();
		Department Department= new Department();
		Student student=new Student();
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		Department.deptName();
		student.StudentName();
		student.Studentdept();
		student.StudentId();
	}

}