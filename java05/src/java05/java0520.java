package java05;

import java.util.Scanner;

public class java0520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value:");
		int val = scn.nextInt();
		System.out.print(fac(val));
	}

	public static String fac(int v1) {
		String i = "";

		while (v1 / 10 >= 1) {
			i = " " + (v1 % 10) + i;
			v1 = v1 / 10;
		}
		i = " " + v1 + i;
		return i;
	}

}
