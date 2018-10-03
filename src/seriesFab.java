
public class seriesFab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int FirstNo=0;
		int secondNo=1;
	int ab;
		
		int sum = 0;
		System.out.println(FirstNo);
		System.out.println(secondNo);
		
		for(int i=0;i<=5;i++)
		{
			sum=FirstNo+secondNo;
			System.out.println(sum);
			FirstNo=secondNo;
			secondNo=sum;
			
		}
		
		
		
		
	}

}
