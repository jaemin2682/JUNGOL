import java.util.Scanner;

public class pb127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		
		while(true) {
			int num = s.nextInt();
	
			if(num<0 || num>100) break;
			
			cnt++;
			sum += num;
		}
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + String.format("%.1f", (double)sum/cnt));
	}

}
