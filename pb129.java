import java.util.Scanner;

public class pb129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		char conti;
		do {
			System.out.print("Base = ");
			int base = s.nextInt();
			
			System.out.print("Height = ");
			int height = s.nextInt();
		
			System.out.println("Triangle width = " + String.format("%.1f", (double)base*height/2));
			
			System.out.print("Continue? ");
			conti = s.next().charAt(0);
		} while(conti == 'Y' || conti == 'y');
	}

}
