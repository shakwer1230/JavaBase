/**
 * 
 */
package chaptertwo;

import java.util.Scanner;

/**
 * Scanner��
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
		System.out.println("�ղ���������ݣ�"+string);
	}
	public static void test02() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������һ��������");
		Integer a= scanner.nextInt();
		System.out.println("��������һ��������");
		Integer b= scanner.nextInt();
		System.out.println("������Ϊ��"+(a+b));
	}
}
