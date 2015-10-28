package java03;

import java.util.Scanner;

public class java0313 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("input Value and Char:");
		int val = scn.nextInt();
		char a = scn.next().charAt(0);
		square(val, a);
	}

	public static int square(int v1, char v2) {
		for (int i = 1; i <= v1; i++) {
			for (int j = 1; j <= v1; j++) {
				System.out.print(v2);
			}
			System.out.println("");
		}
		return v1;
	}
}