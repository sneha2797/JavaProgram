package Programlist;

public class Program25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int r=1;r<=8;r++) {
			for(int space=1;space<=r;space++) {
				System.out.print(" ");
			} 
			for(int c=8;c>=r;c--)
			{
				System.out.print("*");
			}
				System.out.println();
		}
	}

}
