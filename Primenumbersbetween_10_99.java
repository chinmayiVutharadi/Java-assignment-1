import java.util.Scanner;

public class Primenumbersbetween_10_99 {

	public static void main(String[] args) {
		for (int i = 10; i <= 99; i++) {
			if (isPrime(i))
				System.out.println(i);
		}

	}

	public static boolean isPrime(int num) {

		boolean flag = true;

		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
