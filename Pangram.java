package in.ineuron.in;

public class Pangram {

	public static void main(String[] args) {
		
		boolean flag=false;
		String string ="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		
		string = string.replace(" ","");
		
		char[] ch=string.toCharArray();
		int [] ar=new int[26];
		
		for(int i=0;i<ch.length;i++) {
			int index=ch[i]-65;
			ar[index]++;
		}
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0) {
				System.out.println("It's not panagram");
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("It's pangram");
		}
	}
}
