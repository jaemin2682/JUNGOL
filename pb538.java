import java.util.Scanner;

public class pb538 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("number? ");
			int num = s.nextInt();
			
			if(num > 0) System.out.println("positive integer");
			else if(num<0) System.out.println("negative number");
			else break;
			
		}
	}

}
