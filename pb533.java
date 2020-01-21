import java.util.Scanner;
public class pb533 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char gender = s.next().charAt(0);
		int age = s.nextInt();
		
		if(gender == 'M') {
			if(age >= 18) System.out.println("MAN");
			else System.out.println("BOY");
		}
		else {
			if(age>=18) System.out.println("WOMAN");
			else System.out.println("GIRL");
		}
		
	}

}
