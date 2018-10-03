import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAction {

	public static void main(String[] args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();

		Date date = new Date();
		String dt = sdf.format(date);

		c.setTime(sdf.parse(dt));
		c.add(Calendar.DATE, 1); // number of days to add
		dt = sdf.format(c.getTime());

		System.out.println(dt);
		String afterSubString = dt.substring(8);
		System.out.println(afterSubString);

	}

}
