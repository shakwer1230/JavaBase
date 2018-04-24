/**
 * 
 */
package chapterone;

/**
 * @author shakwer
 *
 */
public class TestWhileAndFor {

	public static void main(String[]aa) {
		int oddsum=0;
		int evensum=0;
		int i=0;
		while (i<=100) {
			if(i%2==0) {
				evensum+=i;
			}else {
				oddsum+=i;
			}
			i++;
		}
		System.out.println(evensum);
		System.out.println(oddsum);
		
		System.out.println("*****************************");

		for(int j=1;j<1000;j++) {
			if(j%5==0) {
				System.out.print(j+"\t");
			}
			if(j%15==0) {
				System.out.println();
			}
			
		}
	}
}
