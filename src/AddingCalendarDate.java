import java.time.Month;
import java.util.Calendar;

public class AddingCalendarDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar now = Calendar.getInstance();
		
		//System.out.println(now);
		
		

		// getting current time 
		
		System.out.println(now.get(Calendar.MONTH)+1 +"-"+now.get(Calendar.DATE));

	}

}
