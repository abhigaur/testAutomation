package constructorExample;

import java.util.Date;

public class UseDate {
	
	Date date= new Date();
	public void useDateAajKi()
	{
		
		Test1 obj= new Test1( date);
		int aajKiDate = obj.getcurrentDate();
		System.out.println(aajKiDate);
	}
	
	public void useDateAfter30Days()
	{

		Test1 obj= new Test1( date);
		
	obj.getDateTenDaysAfter();
	
	}
	
	public void useDateBefore10Days()
	{

		Test1 obj= new Test1( date);
		
	int beforeDate = obj.getDateTenDaysBefore();
	System.out.println(beforeDate);
	
	}
	
	public static void main(String[] args) {
		
		UseDate ab= new UseDate();
		ab.useDateAajKi();
		ab.useDateAfter30Days();
		ab.useDateBefore10Days();
		
		
	}

}
