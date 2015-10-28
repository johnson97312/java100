import java.util.Scanner;

public class input_compute0252 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value");
		int val = scn.nextInt();
		int a = 1;
		int m = 0;
		while (a <= val) {
			m = 0;
			if (a == 1) {
				System.out.print(a + " ");
				a++;
			}
			for (int k = 1; k <= a; k++) {
				if (a % k == 0) {
					m++;
				}
			}
			if (m == 2) {
				System.out.print(a + " ");
			}
			a++;
		}
	}

}
