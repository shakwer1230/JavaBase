/**
 * 
 */
package chapterone;

/**µ›πÈÀ„∑®
 * @author shakwer
 *
 */
public class TestRecursion {
	public static void test01() {
		System.out.println("TestRecursion.test01");
		test02();
//		test01();
	}
	public static void test02() {
		System.out.println("TestRecursion.test02");
	}
	
	static int a=0;
	public static void testRescrison() {
		a++;
		System.out.println("TestRecursion.testRescrison");
		if(a<=10) {
			testRescrison();
		}else {
			System.out.println("over");
		}
		
		
	}
	
	public static long faction(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*faction(n-1);
		}
	}
	public static void main(String[]args) {
//		test01();
//		testRescrison();
		faction(5);
	}

}
