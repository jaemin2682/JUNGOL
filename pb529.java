import java.util.Scanner;

public class pb529 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int height = s.nextInt(), weight = s.nextInt();
		
		int	score = weight + 100 - height;
		
		System.out.println(score);
		if(score > 0) System.out.println("Obesity");
	}

}
