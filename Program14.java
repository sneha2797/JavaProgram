package Programlist;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("name of destination=");
      String str=scan.next();
      System.out.println("distance to the destination=");
      int distance=scan.nextInt();
      System.out.println("enter total time=");
      int total=scan.nextInt();
    /* System.out.println("no of breaks in a journey=");
     int breaks=scan.nextInt(); */
     System.out.println("times per break");
     int t1=scan.nextInt();
     int t2=scan.nextInt();
     float speed=distance/((total/60)-(t1+t2)/60);
     System.out.println("speeds="+speed);
		
	}

}
