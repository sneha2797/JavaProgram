package Programlist;
import java.util.Scanner;
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the number");
       int num=scan.nextInt();
       if(num%2==0)
       {
    	   System.out.println("num is even");
       }
       else {
    	   System.out.println("num is odd");
       }
	}

}
