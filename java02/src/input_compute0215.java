import java.util.Scanner;

public class input_compute0215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Height and Weight:");
		int h = scn.nextInt();
		int w = scn.nextInt();
		System.out.println("Height:" + h / 2.54f + "\tWeight:" + w / 0.454f);
	}
}
