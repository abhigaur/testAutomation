package stringExample;

public class RemovingWhiteSpace {
	
	public static void main(String[] args) {
		

	
	String mainstring = "abhi test engineer";

	char[] mainCharArray = mainstring.toCharArray();
	  StringBuffer sb = new StringBuffer();
	
	
	
	for(int i=0;i<mainCharArray.length;i++)
	{
		   if( (mainCharArray[i] != ' ') && (mainCharArray[i] != '\t') )
           {
               sb.append(mainCharArray[i]);
           }
	}

    System.out.println(sb); 

}	}
