package java00;

import java.util.Scanner;

public class java0004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = (int) (Math.random() * 42+1);
		int b = (int) (Math.random() * 42+1);
		int c = (int) (Math.random() * 42+1);
		int d = (int) (Math.random() * 42+1);
		int e = (int) (Math.random() * 42+1);
		int f = (int) (Math.random() * 42+1);

		while (a == b) {
			b = (int) (Math.random() * 42+1);
		}
		while (a == c) {
			c = (int) (Math.random() * 42+1);
		}
		while (a == d) {
			d = (int) (Math.random() * 42+1);
		}
		while (a == e) {
			e = (int) (Math.random() * 42+1);
		}
		while (a == f) {
			f = (int) (Math.random() * 42+1);
		}
		while (b == c) {
			c = (int) (Math.random() * 42+1);
		}
		while (b == d) {
			d = (int) (Math.random() * 42+1);
		}
		while (b == e) {
			e = (int) (Math.random() * 42+1);
		}
		while (b == f) {
			f = (int) (Math.random() * 42+1);
		}
		while (c == d) {
			d = (int) (Math.random() * 42+1);
		}
		while (c == e) {
			e = (int) (Math.random() * 42+1);
		}
		while (c == f) {
			f = (int) (Math.random() * 42+1);
		}
		while (d == e) {
			e = (int) (Math.random() * 42+1);
		}
		while (d == f) {
			f = (int) (Math.random() * 42+1);
		}
		while (e == f) {
			f = (int) (Math.random() * 42+1);
		}
		System.out.print(a + "  " + b + "  " + "  " + c + "  " + d + "  " + e + "  " + f);
	}

}
