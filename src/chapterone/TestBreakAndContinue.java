/**
 * 
 */
package chapterone;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

/**
 * @author shakwer
 *
 */
public class TestBreakAndContinue {
	public static void main(String[]args) {
		int total=0;
		/**
		 * break���
		 */
		System.out.println("begin");
		while(true) {
			total++;
			int i=(int)Math.round(100*Math.random());
			if(i==88) {
				break;
			}
		}
		System.out.println("Game over,used "+total+" times");
		/**
		 * continue���
		 */
		System.out.println("###############################");
		for (int i = 100; i <= 150; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
			
		}
		
		/**
		 * ����ǩ��continue break
		 * 
		 */
		System.out.println("########101-150֮�������##########");
		int count=0;
		over:for (int i = 101; i <150 ; i++) {
			for (int j = 2; j < i/2; j++) {
				if(i%j==0) {
					continue over;
				}
			}
			System.out.println(i);
		}
	}
}
