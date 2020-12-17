
public class Palindrome {

    public static void main(String[] args) {

        int num = 141, reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;
        int Count = 1;
        // reversed integer is stored in variable 
        while( num != 0 )
        {	System.out.println("Iteration "+ Count);
            remainder = num % 10;
            System.out.println("remainder "+remainder);
            reversedInteger = reversedInteger * 10 + remainder;
            System.out.println("reversedInteger "+reversedInteger);
            num  /= 10;
            System.out.println("num "+num);
            Count++;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}