/**
 * 
 */
package Generic;

import java.util.List;

/**
 * �Ƿ������ж��巺�ͷ���
 * �ڷ�������ǰ��һ��<��д��ĸ>
 * @author shakwer
 *
 */
public class Method {
	//���ͷ���
	public static <T>void test(T t){
		System.out.println(t);
	}
	//���Ʒ������� extends
	public static <T extends List>void test(T t){
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		test("Hello world");
		test(12321321);
	}

}
