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
				System.out.println("��J�A�n����������ƶq:");
				int val = scn.nextInt();
				if (val > 3) {
					System.out.println("��J���~�A�ƶq�ݵ���1~3");
					break;
				}
				i -= val;
				System.out.println("�ѤU������ƶq:" + i);
				if (i < 1) {
					System.out.println("�A��F");
					break;
				}
				if (i < 3 && i - 1 > 0) {
					System.out.println("�q�������F" + (i - 1) + "�ڤ���");
					i = i - (i - 1);
					System.out.println("�ѤU������ƶq:" + i);
				} else if (i > 3) {
					int a = ran.nextInt(3) + 1;
					i -= a;
					System.out.println("�q�������F" + a + "�ڤ���");
					System.out.println("�ѤU������ƶq:" + i);
				} else {
					System.out.println("�AĹ�F");
					System.out.println("�C�����s�}�l");
				}
			}
		}
	}

}