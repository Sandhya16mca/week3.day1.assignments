package week3.day1.assignments;

public class Students {
	public int getStudentInfo(int id) {

		return id;
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("id is " + id);
		System.out.println("name is " + name);

	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("email is " +email);
		System.out.println("phone number is " +phoneNumber);

	}
	public static void main(String[]args) {
		Students stu= new Students();
		int students= stu.getStudentInfo(1);
		stu.getStudentInfo(1,"Sandhya");
		stu.getStudentInfo("sandhya16mca@gmail.com", 786793585);
	}
}