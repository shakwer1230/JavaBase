/**
 * 
 */
package chapterone;

/**
 * @author shakwer
 *¾Å¾Å³Ë·¨±í
 */
public class TestWhileFor2 {
	public static void main(String[]args) {
		for (int j=1;j<9;j++) {
			for(int i=1;i<=j;i++) {
				
				System.out.print(i+"*"+j+"="+i*j +"\t" );
			}
			System.out.println();
		}
		
		System.out.println("###############1!+2!+3!+...+10! ############"); 
		
		int sum=0;
		for(int m=1;m<=10;m++) {
			for(int n=1;n<m;n++) {
				System.out.println(m+"*"+n);
				sum+=m*n;
			}
		}
		System.out.println(sum);
	}

}
