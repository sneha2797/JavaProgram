package Programlist;

import java.util.Scanner;

public class Program3c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sr=new Scanner(System.in);
       System.out.println("enter the first no");
       int a=sr.nextInt();
       System.out.println("enter the second no");
       int b=sr.nextInt();
       for(int i=a;i<=b;i++){
    	   if(i%3==0)
    	   {
    		   System.out.println("no is divided by 3="+i);
    	   }
       }
       
	}

}
