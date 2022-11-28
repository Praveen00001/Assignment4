package in.ineuron.in;
public class MaxOccuringCharacter {
	public static void main(String[] args) {
		
		String str = "grass is greener on the other side";
		int[]freq = new int[str.length()];
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		int i,j,min,max;
		
		char string[] = str.toCharArray();
		
		for(i=0;i<string.length;i++) {
			freq[i]=1;
			for(j=i+1;j<string.length;j++) {
				if(string[i]==string[j] && string[i]!=' ' && string[i]!='0') {
				freq[i]=freq[i]+1;
				
				string[j]='0';
				}
			}
		}
		min = max = freq[0];
		
		for(i=0;i<freq.length;i++) {
			if(min>freq[i] && freq[i]!='0') {
				min = freq[i];
				minChar = string[i];
			}
			
		if(max<freq[i]) {
			max = freq[i];
			maxChar = string[i];
		}
	  }
		System.out.println("Min ocuuring character is: " + minChar);
		System.out.println("Max ocuuring character is: " + maxChar);
	}
}
