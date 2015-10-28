package java04;

import java.util.Scanner;

public class java0424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Three Value:");
		int v1 = scn.nextInt();
		int v2 = scn.nextInt();
		int v3 = scn.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;

		if (v1 > v2 && v1 > v3) {
			a = v1;
			if (v2 > v3) {
				b = v2;
				c = v3;
			} else {
				c = v2;
				b = v3;
			}
		} else if (v2 > v1 && v2 > v3) {
			a = v2;
			if (v1 > v3) {
				b = v1;
				c = v3;
			} else {
				c = v1;
				b = v3;
			}

		} else if (v3 > v2 && v3 > v1) {
			a = v3;
			if (v2 > v1) {
				b = v2;
				c = v1;
			} else {
				c = v2;
				b = v1;
			}
		}
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Is Legitimate triangle");
		} else {
			System.out.println("Is not Legitimate triangle");
		}
	}
}
