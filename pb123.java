import java.util.Scanner;

public class pb123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Number? ");
		int animal = s.nextInt();
		
		if(animal == 1) System.out.print("dog");
		else if(animal == 2) System.out.println("cat");
		else if(animal == 3) System.out.println("chick");
		else System.out.println("I don't know.");
	}

}
