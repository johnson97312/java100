package java03;

import java.util.Scanner;

public class java0332 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value");
		int i = 5;
		int j = 7;
		int size = i * j;
		int data[][] = new int[j][i];
		for (int x = 0; x < j; x++) {
			for (int y = 0; y < i; y++) {
				data[x][y] = (int) (Math.random() * 99 + 1);
			}
		}
		for (int x = 0; x < j; x++) {
			for (int y = 0; y < i; y++) {
				System.out.print(data[x][y] + "\t");
			}
			System.out.println("");
		}
	}
}