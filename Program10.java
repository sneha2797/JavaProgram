package Programlist;
import java.util.Scanner;
public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter any four digit no");
          num=scan.nextInt();
          if( num>999 && num<1000)
          {
        	  System.out.println("num");  
          }
          if(num%4==0)
          {
        	System.out.println("year is a leap year");  
          }
	}

}
