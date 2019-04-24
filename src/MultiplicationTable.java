import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		//create new scanner to take in input
		Scanner scnr = new Scanner(System.in);
		
		int num;
		String cont = "y";
		
		System.out.println("Learn your multiplication table!");
		addSpacing();
		
		//while loop to determine if player is continuing
		while(cont.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer: ");
			num = scnr.nextInt();
			addSpacing();
			addTopOfTable(num);
			for(int i = 1; i <= num; i++) {
				System.out.printf("%-4d", i);
				int j;
				for(j = 1; j <= num; j++) {
					System.out.printf("%-4d", (int)(i * j));
					
				}
				addSpacing();

				
				
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
	public static void addSpacing() {
		System.out.println("");
		return;
	}
	public static void addTopOfTable(int num) {
		System.out.print("    ");
		for(int i = 1; i <= num; i++) {
			System.out.printf("%-4d", i);
		}
		addSpacing();
		return;
	}
}
