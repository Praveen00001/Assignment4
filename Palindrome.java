package in.ineuron.in;

public class Palindrome {

	public static void main(String[] args) {
		String s1 = "2552";
		String s2 = "";
		
		System.out.println("Given string is "+ s1);
		
		for (int i=s1.length()-1; i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println("After reversing "+ s2);
		
		if(s1.equals(s2))
		{
			System.out.println("Given String is a palindrome");
		}
		else
		{
			System.out.println("Given String is not a palindrome");
		}

	}

}
