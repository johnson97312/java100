import java.util.Scanner;

public class input_compute0211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Two Value:");
		int v1 = scn.nextInt();
		int v2 = scn.nextInt();
		System.out.println("Sum=" + (v1 + v2) + "\nDifference=" + (Math.abs(v1 - v2)) + "\nProduct=" + v1 * v2);
	}

}
