import java.util.Scanner;

public class input_compute0218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Two Value:");
		int m = scn.nextInt();
		int n = scn.nextInt();
		int v2 = 1;
		System.out.println("C(m,n)=" + fun1(m, v2) / (fun1(n, v2) * (fun1(m - n, v2))));
	}

	public static int fun1(int v1, int result) {

		if (v1 > 1 && v1 - 1 >= 1) {
			result = result * v1 * (v1 - 1);
			v1 = v1 - 2;
			return fun1(v1, result);
		}
		return result;
	}
}
