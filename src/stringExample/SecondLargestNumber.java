package stringExample;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp = 0;
		int arr[]= {2,4,1,9,10,15};
		
		int size = arr.length;
		
		for(int i=0;i<size;i++)
		{
			
			for(int j=i+1;j<size;j++)
			{
				
				if(arr[i]<arr[j])
				{
			temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
					
				}
				
				
			}
			System.out.println(arr[i]);
			
			
			
		}
		System.out.println("second largest number is "+ arr[1]);
		
		
		

	}

}
