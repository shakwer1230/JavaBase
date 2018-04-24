/**
 * 
 */
package chaptersixteen;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author shakwer
 *
 */
public class VisualCalendar {

	public static void main(String[] args) {
		
		System.out.println("请输入日期(格式2010-10-10)");
		Scanner scanner=new Scanner(System.in);
		String temp=scanner.nextLine();
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date=dateFormat.parse(temp);
			Calendar calendar=new GregorianCalendar();
			calendar.setTime(date);
			int day=calendar.get(Calendar.DATE);
			
			
			calendar.set(Calendar.DATE, 1);
			
			int firstDayofWeek=calendar.get(Calendar.DAY_OF_WEEK);
			int maxDate=calendar.getActualMaximum(Calendar.DATE);
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			
			for(int j=1;j<firstDayofWeek;j++) {
				System.out.print("\t");
			}
			for(int i=1;i<=maxDate;i++) {
				if(i==day) {
					System.out.print("*");
				}
				System.out.print(i+"\t");
				int w=calendar.get(Calendar.DAY_OF_WEEK);
				if(w==Calendar.SATURDAY){
					System.out.print("\n");
				}
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/**
	 * 
	 */
	public VisualCalendar() {
		// TODO Auto-generated constructor stub
	}

}
