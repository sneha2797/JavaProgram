package Programlist;
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the first value");
    int a=scan.nextInt();
    System.out.println("enter the second value");
    int b=scan.nextInt();
    if(a>b)
    {
    	System.out.println("a is greater"+a);
    }
    else
    {
    	System.out.println("b is greater"+b);
    }
	}

}
