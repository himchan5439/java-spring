package ch15;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student edward = new Student("Edward", 20000);
		
		Taxi taxi = new Taxi("잘나간다 운수", 10000);
		
		edward.takeTaxi(taxi, 10000);
		
		edward.showInfo();
		taxi.showInfo();
		
	}

}
