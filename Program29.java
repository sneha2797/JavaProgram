package Programlist;

import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner=new Scanner(System.in);
		System.out.println("enter any no for table:");
		int no=scaner.nextInt();
		//System.out.println(""+no);
		for(int i=1;i<=10;i++) {
			int table=no*i;
			System.out.println("table:"+table);
		}
	}

}
