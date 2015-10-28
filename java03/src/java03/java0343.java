package java03;

import java.util.Scanner;

public class java0343 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value:");
		int val = scn.nextInt();
		for (int i=1;i<=val;i++){
			for (int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}