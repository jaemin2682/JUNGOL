import java.util.Scanner;

public class pb1341 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int start = s.nextInt();
		int end = s.nextInt();
		
		if(start <= end) {
			for(int i = start;i<=end;i++) {
				for(int j=1;j<=9;j++) {
					System.out.print(i + " * " + j + " = " + String.format("%2d", i*j) + "   ");
					if(j%3 == 0) System.out.println();
				}
				System.out.println();
			}
		}
		else {
			for(int i = start;i>=end;i--) {
				for(int j=1;j<=9;j++) {
					System.out.print(i + " * " + j + " = " + String.format("%2d", i*j) + "   ");
					if(j%3 == 0) System.out.println();
				}
				System.out.println();
			}
		}
	}

}
