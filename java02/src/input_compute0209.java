import java.util.Scanner;

public class input_compute0209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Gender and Value:");
		String a = scn.next();
		int b = scn.nextInt();
		int c = 0;
		if (a == "Man" || a == "man") {
			c = (b - 170) * 6 / 10 + 62;
			System.out.println("Weight:" + c);
		} else {
			c = (b - 158) / 2 + 52;
			System.out.println("Weight:" + c);
		}

	}
}
