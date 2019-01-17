package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateCalendar {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // ISO8601 - UTC
		
		System.out.println(sdf.format(d));
		
		// ADD TIME ON DATE
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); // ADD HOURS
		cal.add(Calendar.DAY_OF_MONTH, 2); // ADD DAYS
		cal.add(Calendar.MONTH, 2); // ADD MONTH
		cal.add(Calendar.YEAR, 2); // ADD YEARS
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		// GET UNIT OF TIME FROM DATE
		Date d2 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // ISO8601 - UTC
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		int minutes = cal2.get(Calendar.MINUTE);
		int month = cal2.get(Calendar.MONTH) + 1; // +1 BECAUSE MONTH BEGIN TO "0"
		 
		System.out.println(sdf.format(d2));		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}

}
