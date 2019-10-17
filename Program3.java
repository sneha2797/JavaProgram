package Programlist;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the radius");
		int r=scan.nextInt();
		double area=3.142*r*r;
		double circum=2*3.142*r;
		System.out.println("area="+area);
		System.out.println("circum="+circum);

	}

}
