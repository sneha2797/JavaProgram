package Programlist;

import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner div=new Scanner(System.in);
		System.out.println("enter first no");
		int a=div.nextInt();
		System.out.println("enter second no");
		int b=div.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%3==0) {
				System.out.println("no div by 3="+i);
			}
		}
		
	}

}
