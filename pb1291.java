import java.util.Scanner;
public class pb1291 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int start = s.nextInt();
			int end = s.nextInt();
			
			if(start<2 || start>9 || end<2 || end>9) {
				System.out.println("INPUT ERROR!");
				continue;
			}
			
			for(int i=1;i<=9;i++) {
				if(start <= end) {
					for(int j = start;j<=end;j++) {
						System.out.print(j + " * " + i + " = " + String.format("%2d", i*j) +  "   ");
					}
					System.out.println();
				}
				else {
					for(int j = start;j>=end;j--) {
						System.out.print(j + " * " + i + " = " + String.format("%2d", i*j) +  "   ");
					}
					System.out.println();
				}
			}
			break;
		}	
	}
}
