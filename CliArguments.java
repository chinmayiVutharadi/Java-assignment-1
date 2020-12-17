import java.util.Scanner;

public class CliArguments {

	public static void main(String[] args) {

		System.out.print("Enter value: ");
		if (args.length == 0) {
			System.out.println("No Values");
		} else {
			for (int i = 0; i < args.length; i++)

				System.out.print(args[i] + " , ");

		}

	}
}