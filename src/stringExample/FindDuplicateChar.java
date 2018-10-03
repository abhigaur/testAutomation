package stringExample;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mainstring = "abdabrtg";

		char[] mainCharArray = mainstring.toCharArray();

		for (int i = 0; i < mainCharArray.length; i++) {
			
			for(int j=i+1;j<mainCharArray.length;j++)
			{

			if (mainCharArray[i] == mainCharArray[j]) {

				System.out.println("Duplicate char is" + mainCharArray[i]);

			}
			
			}
		}

	}
}
