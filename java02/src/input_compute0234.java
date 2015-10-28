import java.util.Scanner;

public class input_compute0234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value:");
		int val = scn.nextInt();
		if (val < 600) {
			System.out.println(val / 2f);
		} else if (600 <= val && val < 1200) {
			System.out.println(val / 2f * 0.9f);
		} else {
			System.out.println(val / 2f * 0.79f);
		}
	}

}