
public class Char_Alpha_Digit_Special {
	static class GFG { 
		  
	    static void charCheck(char input) 
	    { 
	        // CHECKING FOR ALPHABET 
			if ((input >= 65 && input <= 90) 
	            || (input >= 97 && input <= 122)) 
	            System.out.println(" Alphabet "); 
	  
	        // CHECKING FOR DIGITS 
	        else if (input >= 48 && input <= 57) 
	            System.out.println(" Digit "); 
	  
	        // OTHERWISE SPECIAL CHARACTER 
	        else
	            System.out.println(" Special Character "); 
	    } 
	  
	    // Driver Code 
	    public static void main(String[] args) 
	    { 
	        char input = 'a'; 
	        charCheck(input); 
	    } 
	} 
	  
}
