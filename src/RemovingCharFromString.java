import java.util.Scanner;

public class RemovingCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		String mainstring="abhi he is";
		
          char[] mainCharArray = mainstring.toCharArray();
          
          System.out.println(mainCharArray);
 
 
	        
	        
	        for(int i=0;i<mainCharArray.length;i++)
	        {
	        
	      //System.out.println(mainCharArray[i]);
	      

	      if (mainCharArray[i] == 'h' && mainCharArray[i+1] == 'e')
	      {
	    	  mainCharArray[i] = ' ';
	    	  mainCharArray[i + 1] = ' ';
	         i = i +2;
	         System.out.println(mainCharArray);
	      }
	      else
	      {
	       
	      }
	        	
	        	
	        }
	        
	        
	        
	      
	      
	}
	}


