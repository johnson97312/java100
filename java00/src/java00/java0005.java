package java00;

import java.util.Scanner;

public class java0005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = 10;
		int m = 10;
		int data[][] = new int[n][m];
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				int b = (int) (Math.random() * 10+1);
				data[i][j] = b;
			}
			int a = (int) (Math.random() * 10+1);
		}
		for (int x = 0; x <= 9; x++) {
			for (int y = 0; y <= 9; y++) {
				System.out.print(data[x][y] + "\t");
			}
			System.out.println("");
		}
	}
}