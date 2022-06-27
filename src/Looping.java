
public class Looping {

	public static void main(String[] args) {

		// if loop, if-else loop

		int a = 6;

		if (a <= 5) {
			System.out.println("Value is below or equal 5");
		} else {
			System.out.println("Value is greater than 5");
		}

		// for loop
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			if (i == 7) {
				break;
			}
			System.out.print(i);
		}

		System.out.println(" Switch case example ..");
		// Switch case statements
		int b = 5;

		switch (b) {

		case 5:
			System.out.println("5");
			break;

		case 6:
			System.out.println("6");
			break;

		default:
			System.out.println("Not in 5 or 6");
		}

		System.out.println(" While Loop exmple..");
		// while loop and dowhile loop?

		int i = 1;
		while (i <= 10) {
			System.out.print(i);
			i++;
		}
		System.out.println(" ");
		System.out.println(" do..while Loop exmple..");
		// do..while loop
		do {
			System.out.print(i);
			i--;
		} while (i > 0);

	}
}