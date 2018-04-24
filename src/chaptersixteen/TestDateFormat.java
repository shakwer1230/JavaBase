/**
 * 
 */
package chaptersixteen;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shakwer
 *
 */
public class TestDateFormat {

	public static void main(String[] args) {
		DateFormat dFormat=new SimpleDateFormat("yyyy-MM-dd");
		Date date=new Date(12312312321L);
		
		String  sl=dFormat.format(date);
		System.out.println(sl);
		
		System.out.println("#######################");
		String string="1970-05-23 11:11:11";
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Date date2=format.parse(string);
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
