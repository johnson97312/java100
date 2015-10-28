package java03;

import java.util.Scanner;

public class java0385 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value");
		int i = scn.nextInt();
		int j = i;
		int m = 1;
		int data[][] = new int[i][j];
		for (int a = 0; a < i; a++) {
			if (a % 2 != 0) {
				for (int b = j-1 ; b >= 0; b--) {
					data[a][b] = m;
					m++;
				}
			} else {
				for (int b = 0; b < j; b++) {
					data[a][b] = m;
					m++;
				}
			}
		}System.out.println("A-Array");
		for (int a = 0; a < i; a++) {		
			for (int b = 0; b < j; b++) {
				System.out.print(data[a][b] + "\t");
			}
			System.out.println("");
		}
		System.out.println("b-Array");
		for (int b = 0; b < i; b++) {
			for (int a = 0; a < j; a++) {
				System.out.print(data[a][b] + "\t");
			}
			System.out.println("");
		}
	}
}
