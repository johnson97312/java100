package java00;

import java.util.Scanner;

public class java0023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = (int) (Math.random() * 100 + 1);
		int b = (int) (Math.random() * 100 + 1);
		int c = (int) (Math.random() * 100 + 1);
		while (a == b) {
			b = (int) (Math.random() * 100 + 1);
		}
		while (a == c) {
			c = (int) (Math.random() * 100 + 1);
		}
		while (b == c) {
			c = (int) (Math.random() * 100 + 1);
		}

		int max = 0;
		int min = 0;
		if (a > b && a > c && b > c) {
			max = a;
			min = c;
		}
		if (a > b && a > c && c > b) {
			max = a;
			min = b;
		}
		if (b > a && b > c && a > c) {
			max = b;
			min = c;
		}
		if (b > a && b > c && c > a) {
			max = b;
			min = a;
		}
		if (c > a && c > b && a > b) {
			max = c;
			min = b;
		}
		if (c > a && c > b && b > a) {
			max = c;
			min = a;
		}
		System.out.println(a + " " + b + " " + c);
		System.out.println("Max:" + max + "\t Min:" + min);
	}
}
