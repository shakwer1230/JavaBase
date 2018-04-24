/**
 * 
 */
package chaptertwo;

import java.util.Scanner;

/**
 * Scanner类
 * @author shakwer
 *
 */
public class TestScanner {
	
	public static void main(String[]args) {
		test02();
	}
	
	public static void test01() {
		Scanner scanner=new Scanner(System.in);
		String string= scanner.next();
		System.out.println("刚才输入的内容："+string);
	}
	public static void test02() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个加数：");
		Integer a= scanner.nextInt();
		System.out.println("请输入另一个加数：");
		Integer b= scanner.nextInt();
		System.out.println("计算结果为："+(a+b));
	}
}
