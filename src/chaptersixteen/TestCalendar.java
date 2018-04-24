/**
 * 
 */
package chaptersixteen;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author shakwer
 *
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar calendar=new GregorianCalendar();
		//calendar.set(2001,1,1,12,22,43);
		
		//calendar.set(Calendar.YEAR, 2001);
		//calendar.set(Calendar.MONTH, 11);
		//calendar.set(Calendar.DATE,11);
		
		calendar.setTime(new Date());
		
		
		System.out.println(		calendar.getTimeInMillis());
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.YEAR));
		
		calendar.add(Calendar.YEAR, 16);
		calendar.add(Calendar.MONTH, 100);
		System.out.println(calendar.getTime());
	}

}
