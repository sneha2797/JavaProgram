package Programlist;

import java.util.Scanner;

public class Program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c1=new Scanner(System.in);
		System.out.println("Enter the row=");
		int row=c1.nextInt();
		
		for(int r=1;r<=row;r++) {
			for(int space=row;space>=row;space--) {
				System.out.print(" ");
			} 
			for(int c=row;c>=r;c--)
			{
				System.out.print("*");
			}
				System.out.println();
		}
	}

}
