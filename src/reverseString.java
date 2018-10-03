
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "abhilash gaur";
		char[] nameCharArrray = name.toCharArray();
		int charSize = nameCharArrray.length;
		System.out.println("char array size is"+charSize);
		// for printing the array
		for(int i=0;i<charSize;i++)
		{
			System.out.println(nameCharArrray[i]);
		}
		
		// for revesr the string 
		
		for(int i=charSize;i>=1;i--)
		{
			System.out.println(nameCharArrray[i-1]);
		}

	}

}
