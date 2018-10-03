
public class FindDuplicateNumber {

	
	

	int arr[]=  {4, 2, 4, 5, 2, 3, 1,1,1};
	
	public void findDuplicateNumber()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate number is at"+arr[j] +" position at "+ j);
				}
			}
		}
	}

	
	public static void main(String[] args) {
		
		FindDuplicateNumber f= new FindDuplicateNumber();
		f.findDuplicateNumber();
		// TODO Auto-generated method stub

	}

}
