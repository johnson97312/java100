package java03;

import java.util.Scanner;

public class java0347 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println("");
		}
	}
}
