import java.util.Calendar;
import java.util.Date;

public class IncrementDate {

	Date date;

	public int getcurrentDate() {
		date = new Date();
		int todayDate = date.getDate();
		return todayDate;

	}

	public void getDateTenDaysAfter() {
		date = new Date();
		 Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	     cal.add(Calendar.DATE, 20);
			
	}

	public int getDateTenDaysBefore() {
		date = new Date();
		int TenDaysBefore = date.getDate() - 10;
		return TenDaysBefore;

	}

	public static void main(String[] args) {
		
		IncrementDate obj= new IncrementDate();
		
		int aajKiDate = obj.getcurrentDate();
		System.out.println(aajKiDate);
		
		
		int TenDaysBefore = obj.getDateTenDaysBefore();
		System.out.println(TenDaysBefore);

	}

}
