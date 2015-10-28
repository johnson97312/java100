package java04;

import java.util.Scanner;

public class java0449 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value");
		int val = scn.nextInt();
		int m = 0;
		while (val > 1) {
			val = val / 10;
			m++;
		}
		m = m + 1;
		System.out.println(m);
	}
}
