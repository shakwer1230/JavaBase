/**
 * 
 */
package chaptersixteen;

import java.util.Date;
import java.util.logging.Logger;

/**
 * @author shakwer
 *
 */
public class TestDate {
	public static void main(String[]a) {
		Date d=new Date();
		System.out.println(d);
		Long tLong=System.currentTimeMillis();
		System.out.println(tLong);
		
		Date date=new Date(1000);
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(date.before(d));
		
		
	}

}
