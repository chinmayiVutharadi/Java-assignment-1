import java.util.Scanner;

public class ColorCode {

	public static void main(String[] args) {
		//char colorCode = 'R';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter color code\n");
		char colorCode= scanner.next().charAt(0);
		switch (colorCode) {
		case 'R':
			System.out.println("R->Red");
			break;
		case 'G':
			System.out.println("G->Green");
			break;
		case 'B':
			System.out.println("B->Blue");
			break;
		case 'O':
			System.out.println("O->Orange");
			break;
		case 'Y':
			System.out.println("Y->Yellow");
			break;
		case 'W':
			System.out.println("W->White");
			break;
		default:
			System.out.println("Invalid Code");
		}

	}

}