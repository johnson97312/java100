package java00;

import java.util.Scanner;

public class java0053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = (int) (Math.random() * 100 + 1);
		while (true) {
			System.out.println("Input Value:");
			int val = scn.nextInt();
			if (val == a) {
				System.out.println("True");
				break;
			} else if (val > a) {
				System.out.println("Too big");
			} else if (val < a) {
				System.out.println("Too small");
			}
		}
	}

}