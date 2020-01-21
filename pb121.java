import java.util.Scanner;
public class pb121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if(num > 0)System.out.println("plus");
		else if(num<0) System.out.println("minus");
		else System.out.println("zero");
	}

}
