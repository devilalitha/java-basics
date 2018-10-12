import java.text.SimpleDateFormat;
import java.util.Date;

public class dateclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d= new Date(); // creating object for date method in this class to use. but this dispalys as "Tue Aug 14 14:35:54 IST 2018"
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/yyyy"); //this is used to customize the date and time according to our wish
		
		//sdf.format(d));
		System.out.println(sdf.format(d)); // we have to pass d object to sdf object as d object will provide date and sdf object will custmse.
		System.out.println(d);
		

	}

}
