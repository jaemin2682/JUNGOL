import java.util.Scanner;

public class pb534 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char alpha = s.next().charAt(0);
		
		switch(alpha) {
			case 'A' :
				System.out.println("Excellent");
				break;
			case 'B' :
				System.out.println("Good");
				break;
			case 'C' :
				System.out.println("Usually");
				break;
			case 'D' : 
				System.out.println("Effort");
				break;
			case 'F' :
				System.out.println("Failure");
				break;
			default :
				System.out.println("error");
				break;
		}
	}

}
