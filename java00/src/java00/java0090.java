package java00;

import java.util.Scanner;

public class java0090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = 0;
		int m = 0;
		System.out.println("Input n and m:");
		n = scn.nextInt();
		m = scn.nextInt();
		System.out.println("Average:" + myrand(n, m));
	}

	public static float myrand(float v1, float v2) {
		float average = 0;
		float result = 0;
		int data[] = new int[(int) v1];
		for (int i = 0; i <= (int) v1 - 1; i++) {
			int val = (int) (Math.random() * v2);
			data[i] = val;
		}
		for (int j = 0; j <= v1 - 1; j++) {
			result = data[j] + result;
		}
		average = result / v1;
		return average;
	}
}
