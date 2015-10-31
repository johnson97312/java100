package java00;

import java.util.Scanner;

public class java0029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int val = (int) (Math.random() * 1000 + 1);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
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
		System.out.println(a + "¥a" + b + "¨Õ" + c + "¬B" + d + "¤¸");
	}

}
