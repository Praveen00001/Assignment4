package in.ineuron.in;
import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s1 = "abcdabcdabcdabcd";
	 	char c1[] = s1.toCharArray();
		int index =0;
		
		for(int i =0; i<c1.length;i++) {
			int j;
			for(j=0;j<i;j++) 
			{
				if(c1[i]==c1[j])
				{
					break;
				}	
			}
		if(j==i) {
			c1[index++] = c1[i];
		}	
	  }
		System.out.println(String.valueOf(Arrays.copyOf(c1, index)));   	
     }
 }