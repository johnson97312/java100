import java.util.Scanner;

public class input_compute0201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("Input Value:");
			int val = scn.nextInt();
			int a = 0;
			int b = 0;
			while (val >= 10) {
				a = val % 10;
				val = val / 10;
				b = b + a;
			}
			b = val + b;
			System.out.println(b);
		}
	}
}
