import java.util.Scanner;

public class pb1856 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int num = 1;
		
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<m;j++) {
					System.out.print(num + " ");
					num++;
				}
			}
			else {
				num += m-1;
				for(int j=0;j<m;j++) {
					System.out.print(num + " ");
					num--;
				}
				num += m+1;
			}
			System.out.println();
		}
	}

}
