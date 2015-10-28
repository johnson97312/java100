import java.util.Scanner;

public class input_compute0217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Three Value:");
		int v1 = scn.nextInt();
		int v2 = scn.nextInt();
		int v3 = scn.nextInt();
		int x = 0, y = 0, z = 0;
		if (v1 > v2 && v2 > v3) {
			x = v1;
			y = v2;
			z = v3;
		}
		if (v2 > v1 && v1 > v3) {
			x = v2;
			y = v1;
			z = v3;
		}
		if (v1 > v3 && v3 > v2) {
			x = v1;
			y = v3;
			z = v2;
		}
		if (v2 > v3 && v3 > v1) {
			x = v2;
			y = v3;
			z = v1;
		}
		if (v3 > v1 && v1 > v2) {
			x = v3;
			y = v1;
			z = v2;
		}
		if (v3 > v2 && v2 > v1) {
			x = v3;
			y = v2;
			z = v1;
		}
		System.out.println(fac(x, y, z));
	}

	public static int fac(int v1, int v2, int v3) {

		if (v1 % v2 == 0 && v1 % v3 == 0) {
			return v1;
		} else {
			if (v1 % v2 == 0 && v1 % v3 != 0) {
				return v1 * v3;
			} else {
				if (v1 % v2 != 0 && v1 % v3 == 0) {
					return v1 * v2;
				} else {
					if (v1 % v2 != 0 && v1 % v3 != 0) {
						return v1 * v2 * v3;
					} else {
						return 0;
					}
				}
			}
		}

	}
}
