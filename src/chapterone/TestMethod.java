/**
 * 
 */
package chapterone;

/**
 * @author shakwer
 *
 */
public class TestMethod {
	public static void main(String[]args) {
		System.out.println("调用方法test01");
		test01();
	}
	
	public static void test01() {
		int an=1;
		int sum=0;
		
		while(an<=100) {
			sum+=an;
			an++;
		}
		
		System.out.println(sum);
	}

}
