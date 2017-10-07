package weekend2;

import java.util.Scanner;

public class MainJet {
	static Scanner kb = new Scanner(System.in);
	static Hangar h = new Hangar();

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
//				h.getJetsArray();
				h.printAllJets();
//			System.out.println("Adding");
			break;
			case 2:
//			System.out.println("Deleting");
			break;
			case 3:
//			System.out.println("Quitting");
			break;
			case 4:
//			System.out.println("Invalid selection");
			break;
			case 5:
//			System.out.println("Invalid selection");
				break;
			}
		} while (menuOption != 5);
	}
}
