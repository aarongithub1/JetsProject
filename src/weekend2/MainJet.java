package weekend2;

import java.util.Scanner;

public class MainJet {
	static Scanner kb = new Scanner(System.in);
	static Hangar h = new Hangar();
	// static Jet j = new Jet();
//	private static Jet[] jetsArray;

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		int menuOption = 0;
		do {
			System.out.println("Welcome to Aaron's Hangar!");
			System.out.println("Select an option below.");
			System.out.println("1) List fleet");
			System.out.println("2) View fastest jet");
			System.out.println("3) View jet with longest range");
			System.out.println("4) Add a jet to Fleet");
			System.out.println("5) Quit");
			menuOption = kb.nextInt();

			switch (menuOption) {
			case 1:
				h.printAllJets();
				break;
			case 2:
				System.out.println("The fastest jet is: " + h.fastestJet() + "\n");
				break;
			case 3:
				System.out.println("The jet with the longest range is: " + h.longestRange() + "\n");
				break;
			case 4:
				String model;
				int speed;
				int range;
				long price;
				System.out.print("\n");
				System.out.print("Enter the Model of jet: ");
				model = kb.next();
				System.out.print("Enter the Speed of jet (mph): ");
				speed = kb.nextInt();
				System.out.print("Enter the Range of jet: ");
				range = kb.nextInt();
				System.out.print("Enter the Price of jet: ");
				price = kb.nextLong();
				System.out.print("");

				Jet jet = new Jet(model, speed, range, price);
				h.addJetToArray(jet);
				break;
			case 5:
				System.out.println("Good Bye!\n\n");
				break;
			}
		} while (menuOption != 5);
	}
}
