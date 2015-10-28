package java04;

import java.util.Scanner;

public class java0407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input char:");
		char str = scn.next().charAt(0);
		if (65 <= (int) str && (int) str <= 90) {
			System.out.println((char) (str + 32));
		} else if (97 <= (int) str && (int) str <= 122) {
			System.out.println((char) (str - 32));
		}
	}
}
