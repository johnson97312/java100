package java02;

import java.util.Scanner;

public class java0286 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input String:");
		String str = scn.next();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (48 <= a && a <= 57) {
				sum = sum + (a - '0');
			}
		}
		System.out.println("sum=" + sum);
	}

}