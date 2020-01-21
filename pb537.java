import java.util.Scanner;

public class pb537 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int cnt = 1;
		int sum = 0;
		
		while(true) {
			if(cnt > num) break;
			sum += cnt;
			cnt++;
		}
		
		System.out.println(sum);
	}

}
