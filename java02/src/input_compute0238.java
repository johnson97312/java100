import java.util.Scanner;

public class input_compute0238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value:");
		int val = scn.nextInt();
		int result = 0;
		while (val >= 1) {
			result = result + val * (val + 1);
			val = val - 1;
		}
		System.out.println(result);
	}

}