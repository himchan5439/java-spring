package ch3;

public class FuntionTest {
	public static int addNum(int a, int b) {
		return a + b;
	}
	public static int addNum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	public static void main(String[] args) {
		System.out.println(addNum(10, 10));
		System.out.println(addNum(10, 10, 20, 20));
	}
}