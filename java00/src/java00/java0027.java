package java00;

import java.util.Scanner;

public class java0027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = (int) (Math.random() * 3000 + 1);
		System.out.println(a);
		if (a % 4 == 0) {
			if (a % 100 == 0) {
				if (a % 400 == 0) {
					System.out.println("Is Leap year");
				} else {
					System.out.println("Is not Leap year");
				}
			} else {
				System.out.println("Is Leap year");
			}
		} else {
			System.out.println("Is not Leap year");
		}
	}

}
