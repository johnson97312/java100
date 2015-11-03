package java01;

import java.util.Scanner;

public class java0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input String:");
		String val = scn.next();
		char data[] = val.toCharArray();
		for (int i = 0; i < val.length(); i++) {
			data[i] = val.charAt(i);
		}
		for (int j = val.length() - 1; j >= 0; j--) {
			System.out.print(data[j]);
		}

	}

}