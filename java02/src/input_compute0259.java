import java.util.Scanner;

public class input_compute0259 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value");
		int val = scn.nextInt();
		int a = 0;
		int n = 1;
		if (val > 10000) {
			System.out.println(n);
		} else {
			while (a <= 10000) {
				n++;
				a = (int) Math.pow(val, n);
			}
			System.out.println(n);
		}
	}
}
