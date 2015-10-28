import java.util.Scanner;

public class input_compute0246 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value:");
		int val = scn.nextInt();
		int v1 = val;
		int result = 0;
		String j = "";
		while (v1 > 1) {
			if (val % v1 == 0) {
				j = Integer.toString(v1) + "." + j;
			}
			v1 = v1 - 1;
		}
		j = "1." + j;
		System.out.print(j);

		if (j.equals("1." + val + ".")) {
			System.out.print("\nThe number is Prime number");
		} else {
			System.out.print("\nThe number is not Prime number");
		}
	}
}