package java05;

import java.util.Scanner;

public class java0522 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value:");
		int val = scn.nextInt();
		int result = 0;
		if (val > 0) {
			System.out.println(fac(val, result));
		}
	}

	public static int fac(int v1, int v2) {

		if (v1 / 10 >= 1) {
			v2++;
			v1 = v1 / 10;
			return fac(v1, v2);
		}
		v2 = v2 + 1;
		return v2;
	}
}
