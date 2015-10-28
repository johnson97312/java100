import java.util.Scanner;

public class input_compute0251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value");
		int val = scn.nextInt();
		int m=1;
		int k=1;
		int p=1;
		while (m<=val){
			System.out.print(m+",");
			m=m+k;
			k=k+1;
		}
		m=0;
		k=0;
		System.out.println("");
		while (m<=val){
			for(int a=1;a<=m;a++){
			System.out.print(m+",");
			}
			m=m+1;
		}
	}
}
