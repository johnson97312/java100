package java00;

import java.util.Scanner;

public class java0054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int val = (int) (Math.random() * 8999 + 1000);
		int m = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int v1 = 0;
		int v2 = 0;
		int v3 = 0;
		int v4 = 0;

		if (val >= 1000) {
			a = val / 1000;
			val = val - 1000 * a;
		}
		if (val >= 100) {
			b = val / 100;
			val = val - 100 * b;
		}
		if (val >= 10) {
			c = val / 10;
			val = val - 10 * c;
		}
		d = val;

		System.out.println("Input Value:");
		int x = scn.nextInt();
		if (x >= 1000) {
			v1 = x / 1000;
			v1 = x - 1000 * v1;
		}
		if (x >= 100) {
			v2 = x / 100;
			x = x - 100 * v2;
		}
		if (x >= 10) {
			v3 = x / 10;
			x = x - 10 * v3;
		}
		v4 = x;
		if (v1 == a || v1 == b || v1 == c || v1 == d) {
			m = m + 1;
		}
		if (v2 == a || v2 == b || v2 == c || v2 == d) {
			m = m + 1;
		}
		if (v3 == a || v3 == b || v3 == c || v3 == d) {
			m = m + 1;
		}
		if (v4 == a || v4 == b || v4 == c || v4 == d) {
			m = m + 1;
		}
		System.out.println("Right Digit" + m);
	}
}
