package java00;

import java.util.Scanner;

public class java0028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int val = (int) (Math.random() * 1000 + 1);
		int v1 = 1000 - val;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		System.out.println("1000$-" + val + "=" + v1);
		if (v1 >= 500) {
			a = v1 / 500;
			v1 = v1 - 500 * a;
		}
		if (v1 >= 100) {
			b = v1 / 100;
			v1 = v1 - 100 * b;
		}
		if (v1 >= 50) {
			c = v1 / 50;
			v1 = v1 - 50 * c;
		}
		if (v1 >= 10) {
			d = v1 / 10;
			v1 = v1 - 10 * d;
		}
		if (v1 >= 5) {
			e = v1 / 5;
			v1 = v1 - 5 * e;
		}
		f = v1;
		System.out.println(
				"500$ *" + a + "\t 100$ *" + b + "\t 50$ *" + c + "\t 10$ *" + d + "\t 5$ *" + e + "\t 1$ *" + f);
	}
}
