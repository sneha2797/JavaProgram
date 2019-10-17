package Programlist;

public class Program26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int r=1;r<=8;r++) {
			for(int space=8;space>=r;space--) {
				System.out.print(" ");
			} 
			for(int c=1;c<=r;c++)
			{
				System.out.print("*");
			}
				System.out.println();
		}
	}

}
