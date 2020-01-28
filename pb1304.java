import java.util.Scanner;
public class pb1304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int y = 1;
		int x = 1;
		
		for(int i=0;i<n;i++) {
			x = y;
			for(int j=0;j<n;j++) {
				System.out.print(x + " ");
				x += n;
			}
			System.out.println();
			y++;
		}
		
	}

}
