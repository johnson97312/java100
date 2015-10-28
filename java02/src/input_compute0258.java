import java.util.Scanner;

public class input_compute0258 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value");
		int val = scn.nextInt();
		int m = 1;
		int j = 0;
		while (j + m <= val) {
			j = j + m;
			m++;
			if (j + m > val) {
				m = m - 1;
				break;
			}
		}
		System.out.println(m);
	}
}
