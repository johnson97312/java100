package java01;

import java.util.Scanner;

public class java0148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Input String:");
		int val = scn.nextInt();
		int a = val;
		int m = 1;

		while (a / 10 >= 1) {
			a = a / 10;
			m++;
		}

		for (int j = 0; j < m; j++) {

			if (val / 10 >= 1) {
				int x = 0;
				x = val % 10;
				System.out.print(x);
				val = val / 10;
			} else {
				System.out.print(val);
			}
		}
	}
}