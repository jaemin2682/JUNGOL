import java.util.Scanner;

public class pb1303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int num = 1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
