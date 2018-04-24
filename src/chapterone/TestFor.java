/**
 * 
 */
package chapterone;

/**
 * @author shakwer
 *for
 */
public class TestFor {

	public static void main(String[]arf) {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
		System.out.println("for 循环开始");
		int sum=0;
		for (int i = 0; i <= 100; i++) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("for 循环结束");
	}
}
