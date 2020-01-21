import java.util.Scanner;
public class pb540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true) {
			int num = s.nextInt();
			if(num == -1) break;
			
			if(num%3 ==0) System.out.println(num/3);
		}
	}

}
