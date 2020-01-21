import java.util.Scanner;
public class pb532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double num1 = s.nextDouble(), num2 = s.nextDouble();
		
		if(num1 >= 4.0 && num2 >= 4.0) System.out.println("A");
		else if(num1>=3.0 && num2 >= 3.0) System.out.println("B");
		else System.out.println("C");

	}

}
