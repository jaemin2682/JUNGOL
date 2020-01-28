import java.util.Scanner;
public class pb2046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		int num = 1;
		
		if(m==1) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
		else if(m==2) {
			for(int i=0;i<n;i++) {
				if(i%2==0) {
					for(int j=1;j<=n;j++) {
						System.out.print(j + " ");
					}
				}
				else {
					for(int j=n;j>0;j--) {
						System.out.print(j + " ");
					}
				}
				System.out.println();
			}
		}
		else if(m==3) {
			for(int i=1;i<=n;i++) {
				int k = i;
				for(int j=0;j<n;j++) {
					System.out.print(k + " ");
					k += i;
				}
				System.out.println();
			}
		}

	}

}
