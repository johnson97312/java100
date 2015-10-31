package java00;

import java.util.Scanner;

public class java0003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value:");
		String val = scn.next();
		System.out.println(fac(val) + "$");
	}

	public static int fac(String v1) {
		int result = 0;
		int a = Integer.parseInt(v1) % 1000;
		int b = Integer.parseInt(v1) % 10000;
		int c = Integer.parseInt(v1) % 100000;
		int d = Integer.parseInt(v1) % 1000000;
		int e = Integer.parseInt(v1) % 10000000;
		if (v1.equals("01272636")) {
			result = 200000;
		} else if (e == 1272636) {
			result = 40000;
		} else if (d == 272636) {
			result = 10000;
		} else if (c == 72636) {
			result = 4000;
		} else if (b == 2636) {
			result = 1000;
		} else if (a == 636) {
			result = 200;
		}
		if (v1 == "39412201") {
			result = 200000;
		} else if (e == 9412201) {
			result = 40000;
		} else if (d == 412201) {
			result = 10000;
		} else if (c == 12201) {
			result = 4000;
		} else if (b == 2201) {
			result = 1000;
		} else if (a == 201) {
			result = 200;
		}
		if (v1 == "94586356") {
			result = 200000;
		} else if (e == 4586356) {
			result = 40000;
		} else if (d == 586356) {
			result = 10000;
		} else if (c == 86356) {
			result = 4000;
		} else if (b == 6356) {
			result = 1000;
		} else if (a == 356) {
			result = 200;
		}
		return result;
	}
}
