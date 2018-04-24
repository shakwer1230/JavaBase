import java.text.ParseException;

/**
 * 
 */

/**
 * @author shakwer
 *　4.抛弃JDK，使用其他类库中的时间格式化类：

　　1.使用Apache commons 里的FastDateFormat，宣称是既快又线程安全的SimpleDateFormat, 可惜它只能对日期进行format, 不能对日期串进行解析。

　　2.使用Joda-Time类库来处理时间相关问题
 */
public class DateUtilTest {
	 public static class TestSimpleDateFormatThreadSafe extends Thread {
	        @Override
	        public void run() {
	            while(true) {
	                try {
	                    this.join(2000);
	                } catch (InterruptedException e1) {
	                    e1.printStackTrace();
	                }
	                try {
	                    System.out.println(this.getName()+":"+DateUtil4.parse("2013-05-24 06:02:20"));
	                } catch (ParseException e) {
	                    e.printStackTrace();
	                }
	            }
	        }    
	    }
	    
	    
	    public static void main(String[] args) {
	        for(int i = 0; i < 3; i++){
	            new TestSimpleDateFormatThreadSafe().start();
	        }
	            
	    }
}
