import java.util.Scanner;

public class pb128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int cnt = 0;
		
		while(true) {
			int num = s.nextInt();
			
			if(num == 0) break;
			
			if(num%3 != 0 && num%5 != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
