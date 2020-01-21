import java.util.Scanner;

public class pb122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		
		if(year%400 ==0 || (year%4 == 0 && year%100 != 0)) System.out.println("leap year");
		else System.out.println("common year");
	}

}
