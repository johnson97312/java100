import java.util.Scanner;

public class input_compute0231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value:");
		float x = scn.nextFloat();
		if (x < -1) {
			System.out.println("y=" + 3 * (Math.pow(x, 2)));
		}
		if (-1 <= x && x <= 1) {
			System.out.println("y=" + (Math.pow(x, 3) + 3 * x - 3));
		}
		if (x > 1) {
			System.out.println("y=" + (2 * x + 3));
		}
	}
}

	