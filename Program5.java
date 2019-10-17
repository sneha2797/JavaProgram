package Programlist;
import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first value");
	    int a=scan.nextInt();
	    System.out.println("enter the second value");
	    int b=scan.nextInt();
	    int add=a+b;
	    System.out.println("add="+add);
	    int sub=a-b;
	    System.out.println("sub="+sub);
	    int div=a/b;
	    System.out.println("div="+div);
	    int mul=a*b;
	    System.out.println("mul="+mul);
	    int mod=a%b;
	    System.out.println("mod="+mod);
	}

}
