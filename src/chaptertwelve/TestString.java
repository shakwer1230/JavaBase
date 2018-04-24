/**
 * 
 */
package chaptertwelve;

/**
 * @author shakwer
 *
 */
public class TestString {
	public static void main(String []ars) {
		String string="java";
		System.out.println(string.replace('a', 'b'));
		
		System.out.println("############1001个对象########");
		String gh="";
		for(int i=0;i<1000;i++) {
			gh+=i;
		}
		
		System.out.println("############1002个对象########");
		String gh2=new String("hello");
		for(int i=0;i<1000;i++) {
			gh2+=i;
		}
	}
}
