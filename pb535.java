import java.util.Scanner;

public class pb535 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double score = s.nextDouble();
		
		switch((int)score) {
			case 4 :
				System.out.println("scholarship");
				break;
			case 3 :
				System.out.println("next semester");
				break;
			case 2 :
				System.out.println("seasonal semester");
				break;
			default :
				System.out.println("retake");
				break;
		}
		
	}

}
