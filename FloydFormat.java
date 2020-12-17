import java.util.Scanner;

public class FloydFormat {
	public static void main(String[] args) {

		System.out.println("Please enter an integer number");
		Scanner scanner = new Scanner(System.in);
		String value = scanner.next();
		int number = Integer.parseInt(value);

		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
