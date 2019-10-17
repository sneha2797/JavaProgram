package Programlist;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the side");
		int side=scan.nextInt();
		int area=side*side;
		int perimeter=4*side;
		System.out.println("area="+area);
		System.out.println("perimeter="+perimeter);


	}

}
