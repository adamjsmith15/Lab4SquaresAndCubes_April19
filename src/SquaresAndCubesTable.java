import java.util.Scanner;

public class SquaresAndCubesTable {
	public static void main(String[] args) {
		//create new scanner to take in input
		Scanner scnr = new Scanner(System.in);
		
		int num;
		String cont = "y";
		
		System.out.println("Learn your squares and cubes!");
		
		//while loop to determine if player is continuing
		while(cont.equalsIgnoreCase("y")) {
			displayIntroduction();
			num = scnr.nextInt();
			addSpacing();
			printTitle();
			for(int i = 1; i <= num; i++) {
				System.out.printf("%-11d", i);
				System.out.printf("%-12d", (int)Math.pow((i), 2));
				System.out.printf("%d\n", (int)Math.pow((i), 3));
				
				
			}
			addSpacing();
		
			// prompt user to get feedback
			System.out.print("Continue? (y/n): ");
			scnr.nextLine();
			cont = scnr.nextLine();
		}
		
		
		//program ends here
		scnr.close();
	}
	//prints table title to system
	public static void printTitle() {
		System.out.println("Number     Squared     Cubed");
		System.out.println("=======    ========    ======");
		return;
	}
	//add a blank line
	public static void addSpacing() {
		System.out.println("");
	}
	//displays intro
	public static void displayIntroduction() {
		addSpacing();
		System.out.print("Enter an integer: ");
	}
}
