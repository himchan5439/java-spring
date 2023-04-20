package ch15;

public class Taxi {
	String taxiName;
	int money;
	
	public Taxi(String taxiName, int money) {
		this.taxiName = taxiName;
		this.money = money;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(taxiName + "회사의 수입은 " + money + "원 입니다.");
	}
}
