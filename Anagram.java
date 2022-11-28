package in.ineuron.in;

public class Anagram {

	public static void main(String[] args) {
		
		boolean flag = true;
		String s1 = "A gentle man";
		String s2 = "Elegant man";
	
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		
		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		
		int ar1[] = new int[26];
		int ar2[] = new int[26];
		
		for(int i=0; i<c1.length; i++) {
			int index = c1[i]-65;
			ar1[index] = ar1[index]+1;
		}	
		for(int i=0; i<c2.length; i++) {
			int index = c2[i]-65;
			ar2[index]++;
		}	
		
		for(int i=0; i<ar1.length;i++) {
			if(ar1[i]!=ar2[i]) {
			System.out.println("Strings are not Anagram");
			flag = false;
			}
			}
		    if(flag==true) {
			System.out.println("Strings are Anagram");
		}
	}
}
