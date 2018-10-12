import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d= new Date();
		Calendar cal=Calendar.getInstance(); //this will create instance for the calendar
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/yyyy");
		//System.out.println(sdf.format(cal.getTime()));
		System.out.println(sdf.format(cal.DAY_OF_WEEK));
		
		//we have many methods for cal. here
		
	}

}
