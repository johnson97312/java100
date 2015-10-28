package java03;

import java.util.Scanner;

public class java0335 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Value:");
        int val=scn.nextInt();
        int result =1;
        for(int i=val;i>0;i--){
        	result=result*i;      	
        }
        System.out.println(result);
	}

}