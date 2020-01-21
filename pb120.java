import java.util.Scanner;

public class pb120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt(), num2 = s.nextInt();
		
		if(num1 > num2) System.out.println(num1 - num2);
		else System.out.println(num2 - num1);
	}

}
