package java04;

import java.util.Scanner;
import java.util.Random;

public class java0456 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		while (true) {
			int i = 12;

			while (i > 0) {
				System.out.println("輸入你要拿取的火柴數量:");
				int val = scn.nextInt();
				if (val > 3) {
					System.out.println("輸入錯誤，數量需等於1~3");
					break;
				}
				i -= val;
				System.out.println("剩下的火柴數量:" + i);
				if (i < 1) {
					System.out.println("你輸了");
					break;
				}
				if (i < 3 && i - 1 > 0) {
					System.out.println("電腦拿走了" + (i - 1) + "根火柴");
					i = i - (i - 1);
					System.out.println("剩下的火柴數量:" + i);
				} else if (i > 3) {
					int a = ran.nextInt(3) + 1;
					i -= a;
					System.out.println("電腦拿走了" + a + "根火柴");
					System.out.println("剩下的火柴數量:" + i);
				} else {
					System.out.println("你贏了");
					System.out.println("遊戲重新開始");
				}
			}
		}
	}

}