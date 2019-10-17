package Programlist;

import java.util.Scanner;

public class Program17a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str=new Scanner(System.in);
		System.out.println("enter the name");
		String name=str.next();
		System.out.println("enter the no");
		int a=str.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println(name);
		}
	}

}
