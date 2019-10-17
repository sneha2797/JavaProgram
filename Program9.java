package Programlist;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	       System.out.println("enter the number");
	       int num=scan.nextInt();
	       if(num%5==0 && num%7==0)
	       {
	    	   System.out.println("num is divisible by 5 and 7");
	       }
	       else {
	    	   System.out.println("num is not");
	       }
		}
	}

