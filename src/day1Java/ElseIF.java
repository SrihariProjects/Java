package day1Java;

public class ElseIF {

	public static void main(String[] args) {
		
		int x=10;
		int y=220;
		int z=30;
		
		if(x>y && x>z) {
			System.out.println("X is greatest");
		}
		else if(y>z) {
			System.out.println("Y is greatest");
		}
		else {
			System.out.println("z is greatest");
		}
	}
}
