package ch4;

public class StudentTest {
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.studentId = 1234;
		student.setStudentName("Lee");
		student.address = "서울 강남구";
		
		student.showStudentInfo();
		
		Student student2 = new Student(4321, "Kim", "경기도 성남시");

		student2.showStudentInfo();
		
	}
}
