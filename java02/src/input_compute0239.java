import java.util.Scanner;

public class input_compute0239 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value:");
		int val = scn.nextInt();
		int result = 0;
		while (val >= 1) {
			result = result + (2 * val - 1) * (2 * val);
			val = val - 1;
		}
		System.out.println(result);
	}

}