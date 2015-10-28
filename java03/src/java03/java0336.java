package java03;

import java.util.Scanner;

public class java0336 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value:");
        int val=scn.nextInt();
        int result =1;
        int i =val;
        while(i>=1){
        	result=result*i;   
        	i--;  	
        }
        System.out.println(result);
	}

}