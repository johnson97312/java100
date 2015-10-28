import java.util.Scanner;

public class input_compute0216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value:");
		int val = scn.nextInt();
		if (val % 2 != 0) {
			System.out.println("Odd");
		} else {
			System.out.println("Even");
		}
	}
}
