import java.util.Scanner;

public class pb126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int odd = 0;
		int even = 0;
		
		while(true) {
			int num = s.nextInt();
			
			if(num == 0) break;
			
			if(num%2 == 0) even++;
			else if(num%2 == 1) odd++;
		}
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		
	
	
	}

}
