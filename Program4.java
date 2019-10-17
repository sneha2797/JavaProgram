package Programlist;
import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the principle");
		float p=scan.nextFloat();
		System.out.println("enter the rate");
		float r=scan.nextFloat();
		System.out.println("enter the time");
		float t=scan.nextFloat();
		float si=(p*r*t)/100;
		System.out.println(si);
	}

}
