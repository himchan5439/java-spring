package ch09;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(100, "Lee");
		
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 97);
		studentLee.showScoreInfo();
		
		
		Student studentKim = new Student(200, "Kim");
		
		studentKim.setKoreaSubject("국어", 100);
		studentKim.setMathSubject("수학", 97);
		studentKim.showScoreInfo();
	}

}
