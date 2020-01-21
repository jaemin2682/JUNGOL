import java.util.Scanner;
import java.math.*;
public class pb539 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;

		while(true) {
			int num = s.nextInt();
			cnt++;
			sum += num;
			if(num >= 100) break;
		}
		
		System.out.println(sum);
		System.out.println(String.format("%.1f", (double)sum/cnt));
	}

}
