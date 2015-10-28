import java.util.Scanner;

public class input_compute0286 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int result = 0;
		int v1 = 0;
		System.out.println("Input String:");
		try {                               //if String ex:123a456
			String val = scn.next();        // result = 0;
			v1 = Integer.parseInt(val);     //if String ex:123456
		} catch (Exception e) {             // result = 21;
			v1 = 0;
		}
		while (v1 / 10 >= 1) {
			int a = v1 % 10;
			result = result + a;
			v1 = v1 / 10;
		}
		result = result + v1;
		System.out.println(result);
	}
}
