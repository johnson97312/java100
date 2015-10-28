import java.util.Scanner;

public class input_compute0269 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Two Value and OP");
		int v1 = scn.nextInt();
		int v2 = scn.nextInt();
		char op = scn.next().charAt(0);
		switch (op) {
		case '+':
			System.out.println(Integer.toString(v1 + v2));
			break;
		case '-':
			int x = v1 - v2;
				System.out.println(Integer.toString(x));
			break;
		case '*':
			System.out.println(Integer.toString(v1 * v2));
			break;
		case '/':
			float v3 = v1;
			float v4 = v2;
			System.out.println(Float.toString(v3 / v4));
			break;
		}

	}

}
