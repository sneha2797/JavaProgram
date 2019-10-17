package Programlist;

import java.util.Scanner;

public class Program11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the day");
	       Scanner scan=new Scanner(System.in);
	       int day=scan.nextInt();
	       switch(day) {
	       case 1:System.out.println("sun");
	       case 2:System.out.println("mon");
	       case 3:System.out.println("tue");
	       case 4:System.out.println("wed");
	       case 5:System.out.println("thr");
	       case 6:System.out.println("fri");
	       case 7:System.out.println("sat");
	       default:
	    	   System.out.println("not a day");       
	}
	}

}
