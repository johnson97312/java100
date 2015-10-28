import java.util.Scanner;

public class input_compute0230 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		for (int i = 1; i <= 6; i++) {
			System.out.println("Input Value:");
			int a = scn.nextInt();
			if (a > 0) {
				x++;
			}
			if (a == 0) {
				y++;
			}
			if (0 > a) {
				z++;
			}
		}
		System.out.println("Positive:" + x + "\nZero:" + y + "\nNegative:" + z);
	}
}
