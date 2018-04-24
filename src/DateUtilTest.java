import java.text.ParseException;

/**
 * 
 */

/**
 * @author shakwer
 *��4.����JDK��ʹ����������е�ʱ���ʽ���ࣺ

����1.ʹ��Apache commons ���FastDateFormat�������Ǽȿ����̰߳�ȫ��SimpleDateFormat, ��ϧ��ֻ�ܶ����ڽ���format, ���ܶ����ڴ����н�����

����2.ʹ��Joda-Time���������ʱ���������
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
