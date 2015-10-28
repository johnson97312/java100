package java04;

import java.util.Scanner;

public class java0433 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input your bithday: \n (ex:0528)");
		int val = scn.nextInt();
		if (val <= 119) {
			System.out.println("Capricorn");
		}
		if (120 <= val && val < 218) {
			System.out.println("Aquarius");
		}
		if (219 <= val && val <= 320) {
			System.out.println("Pisces");
		}
		if (321 <= val && val <= 419) {
			System.out.println("Aries");
		}
		if (420 <= val && val <= 520) {
			System.out.println("Taurus");
		}
		if (521 <= val && val <= 621) {
			System.out.println("Gemini");
		}
		if (622 <= val && val <= 722) {
			System.out.println("Cancer");
		}
		if (723 <= val && val <= 822) {
			System.out.println("Leo");
		}
		if (823 <= val && val <= 922) {
			System.out.println("Virgo");
		}
		if (923 <= val && val <= 1023) {
			System.out.println("Libra");
		}
		if (1024 <= val && val <= 1122) {
			System.out.println("Scorpio");
		}
		if (1123 <= val && val < 1221) {
			System.out.println("Sagittarius");
		}
		if (1222 <= val && val < 1230) {
			System.out.println("Capricorn");
		}
	}

}
