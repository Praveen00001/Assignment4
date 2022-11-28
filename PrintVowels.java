package in.ineuron.in;

public class PrintVowels {

	public static void main(String[] args) {
		
		String string = "Woww!! Ineuron is the best platform to learn JAVA.";
		int countVowels = 0;
		int countConsonants=0;
		int countSpecialCharacters=0;
		int countAllCharacters;
		
		string = string.toLowerCase();
		string = string.replace(" ", "");
				
		for(int i=0;i<string.length();i++) {
			
		if(string.charAt(i)== 'i' || string.charAt(i)== 'e' || string.charAt(i)=='a' || string.charAt(i)=='0' || string.charAt(i)=='u')
			
			countVowels++;
		
		else if(string.charAt(i)>='a' && string.charAt(i)<='z')
			
			countConsonants++;
		
		else
			countSpecialCharacters++;
		
		}
		
		countAllCharacters = countVowels + countConsonants + countSpecialCharacters;
		
		System.out.println("Number of Vowels are " + countVowels);
		System.out.println("Number of Consonants are " + countConsonants);
		System.out.println("Number of Special Characters are "+ countSpecialCharacters);
		System.out.println("Total number of characters are " + countAllCharacters );
		
	}

}
