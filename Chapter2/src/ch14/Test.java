package ch14;

public class Test {
	public static void main(String[] args) {
		Student James = new Student("James", 5000);
		Student Tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		James.takeBus(bus100);
		
		Subway line2 = new Subway(2);
		
		Tomas.takeSubway(line2);
		
		James.showInfo();
		Tomas.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		line2.showSubwayInfo();
		
	}
}
