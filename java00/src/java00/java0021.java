package java00;

import java.util.Scanner;

public class java0021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = (int) (Math.random() * 5 + 1);

		System.out.println("Input Value:");
		int val = scn.nextInt();
		if (val == a) {
			System.out.println("True");
		} else {
			System.out.println("fault \n Ans:" + a);
		}
	}

}
