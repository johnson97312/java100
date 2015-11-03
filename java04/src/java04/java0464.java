package java04;

import java.util.Scanner;

public class java0464 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input ISBN:");
		String str = scn.next();
		char data[] = new char[10];
		if (str.length() > 10) {
			int k = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) - '-' != 0) {
					data[k] = str.charAt(i);
					k++;
				}
			}
		} else {
			data = str.toCharArray();
		}
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += (data[i] - '0') * (10 - i);

		}
		if (sum % 11 == 0) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
	}
}