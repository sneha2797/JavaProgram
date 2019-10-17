package Programlist;
import java.util.Scanner;
public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the day");
       Scanner scan=new Scanner(System.in);
       int day=scan.nextInt();
       switch(day) {
       case 1:System.out.println("sun");
       break;
       case 2:System.out.println("mon");
       break;
       case 3:System.out.println("tue");
       break;
       case 4:System.out.println("wed");
       break;
       case 5:System.out.println("thr");
       break;
       case 6:System.out.println("fri");
       break;
       case 7:System.out.println("sat");
       break;
       default:
    	   System.out.println("not a day");       
}

	}
}
