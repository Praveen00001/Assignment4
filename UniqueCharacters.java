package in.ineuron.in;

class Check {

      String str = "abcdefgha";
      char[] array = str.toCharArray();	
      
      public void Check1() 
      { 
    	  boolean flag= true;
    	  for(int i=0;i<array.length;i++) 
    	  {
  			for(int j=i+1;j<array.length;j++) 
  			{
  				if(array[i]==array[j]) {
  				System.out.println("All are not Unique Characters");
  				flag=false;
  				break;
  				} 
  			}
  		}
    	  if(flag==true)
		   System.out.println("All are Unique Characters");  
      } 
}

public class UniqueCharacters {

	public static void main(String[] args) {
		
		Check a = new Check();
		a.Check1();
	}
}
