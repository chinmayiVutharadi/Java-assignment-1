import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input = 'Y';
		System.out.println("Enter your choice");
		System.out.println("1. Add\n2. Sub");
		int choice = sc.nextInt();
		int result;

		do {
			System.out.println("Enter operand 1");
			int operand1 = sc.nextInt();
			System.out.println("Enter operand 2");
			int operand2 = sc.nextInt();
			switch (choice) {
			case 1:

				result = operand1 + operand2;
				System.out.println(result);
				break;
			case 2:

				result = operand1 - operand2;
				System.out.println(result);
				break;
			}
			System.out.println("Do you wan to continue? Y or N");
			input = sc.next().charAt(0);
		} while (input == 'Y' || input == 'y');
	}

}
