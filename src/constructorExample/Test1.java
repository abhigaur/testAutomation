package constructorExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	
	 Date date;
	
	public Test1(Date date)
	{
		this.date=date;
	}

	public int getcurrentDate() {
		
		int todayDate = date.getDate();
		return todayDate;

	}

	public void getDateTenDaysAfter() {
		
		 Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	   cal.add(Calendar.DATE, 30);
	     
			
	}

	public int getDateTenDaysBefore() {
		
		int TenDaysBefore = date.getDate() + 30;
		return TenDaysBefore;

	}
	public static void main(String[] args) throws Exception {
		/*date= new Date();
		Test1 obj= new Test1(date);
		
		int aajKiDate = obj.getcurrentDate();
		System.out.println(aajKiDate);
		*/

		

	}

}
