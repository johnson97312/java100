package java03;
import java.util.Scanner;

public class java0314 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("input Height and Weight:");
		int h = scn.nextInt();
		int w = scn.nextInt();
		F(h, w);
	}

	public static int F(int v1, int v2) {
		for (int i = 1; i <= v1; i++) {
			for (int j = 1; j <= v2; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println("");
		}
		return v1;
	}
}