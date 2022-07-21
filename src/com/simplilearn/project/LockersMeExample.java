package com.simplilearn.project;

import java.util.List;
import java.util.Scanner;

public class LockersMeExample {

	public static void main(String[] args) {

		FileManager fm = new FileHandler();

		System.out.println("Welcome to LockersMe Application !");
		System.out.println("Application Name : LockersMe");
		System.out.println("Developer Name: Dhruvik Parikh");
		System.out.println("Please enter one of below options:");
		;

		while (true) {
			String mainMenuOptons = mainMenuOptions();
			System.out.println(mainMenuOptons);
			int mainSelection = new Scanner(System.in).nextInt();

			switch (mainSelection) {

			case 1:
				// logic to invoke for list files
				List<String> fileNames = fm.listFiles();
				// Print FileNames
				System.out.println("List file logic here...");
				break;

			case 2:
				// logic to invoke for detailed options
				executeDetailedOptions(fm);
				break;

			case 3:
				// Break program and close application
				System.exit(0);
				break;

			default:
				System.out.println("Please select one of valid option");
				System.exit(0);

			}

		}

	}

	private static void executeDetailedOptions(FileManager fm) {

		while (true) {
			String detailedOption = detailedMenuOptions();
			System.out.println(detailedOption);

			Scanner sc = new Scanner(System.in);
			String subOption = sc.next();

			if ("2.1".equals(subOption)) {
				System.out.println("Add file logic here");
			} else if ("2.2".equals(subOption)) {
				System.out.println("Delete file logic here..");
			} else if ("2.3".equals(subOption)) {
				System.out.println("Search file logic here..");
			} else if ("2.4".equals(subOption)) {
				System.out.println(" Getting back to main menu");
				break;
			} else {
				System.out.println("Invalido Option : Please select again");
			}
		}
	}

	private static String detailedMenuOptions() {
		StringBuilder sb = new StringBuilder();
		sb.append("2.1. Add File \n");
		sb.append("2.2. Delete File \n");
		sb.append("2.3. Search File \n");
		sb.append("2.4. Return Main Menu \n");
		return sb.toString();
	}

	private static String mainMenuOptions() {
		StringBuilder sb = new StringBuilder();
		sb.append("1. List All Files \n");
		sb.append("2. Detailed Options \n");
		sb.append("3. Close Application \n");
		return sb.toString();
	}
}
