/**
 * 
 */
package chapterone;

/**
 * @author shakwer
 *
 */
public class TestBreakContinue {
	public static void main(String [] args) {
		int total=0;
		System.out.println("Begin");
		while(true) {
			total++;
			int i=(int)Math.round(100*Math.random());
			if(i==90) {
				break;
			}
		}
	}

}
