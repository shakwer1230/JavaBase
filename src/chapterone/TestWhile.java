/**
 * 
 */
package chapterone;

/**
 * @author shakwer
 *while �� do while
 */
public class TestWhile {
	public static void main(String[]args) {
		int a=1;
		System.out.println("while ѭ����ʼ");
		while(a<=100) {
			System.out.println(a);
			a++;
		}
		System.out.println("while ѭ������");
		
		/**
		 * ����1+2+������+100
		 */
		int an=1;
		int sum=0;
		
		while(an<=100) {
			sum+=an;
			an++;
		}
		
		System.out.println(sum);
	}
	
}
