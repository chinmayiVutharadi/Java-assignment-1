
public class CharacterCasing {

	public static void main(String[] args) {
		char ch = 'm';
		
		if (Character.isLowerCase(ch)) 
			System.out.println(ch + "->" + Character.toUpperCase(ch));
		else
			System.out.println(ch + "->" + Character.toLowerCase(ch));

	}

}