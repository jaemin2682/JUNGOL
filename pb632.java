import java.util.Scanner;
public class pb632 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt(), num2 = s.nextInt(), num3 = s.nextInt();
		
		int min = (num1>num2) ? num2 : num1;
		min = (num3 > min) ? min : num3;
		
		System.out.println(min);
	}

}
