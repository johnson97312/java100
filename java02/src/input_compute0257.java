import java.util.Scanner;

public class input_compute0257 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println(" \t square: \t cube:");
		for (int a=1;a<=10;a++){
		int x=(int)Math.pow(a, 2);	
		int y=(int)Math.pow(a, 3);		
		System.out.println(a+"\t\t"+x+"\t\t"+y);
		}
	}
}
