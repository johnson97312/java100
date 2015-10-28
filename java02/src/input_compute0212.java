import java.util.Scanner;

public class input_compute0212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Three Value:");
		int v1 = scn.nextInt();
		int v2 = scn.nextInt();
		int v3 = scn.nextInt();
		System.out.println("Sum=" + (v1 + v2 + v3) + "\tAverage:" + (v1 + v2 + v3) / 3f);
	}

}
