/**
 * 
 */
package chapterthree;

/**
 * @author shakwer
 *
 */
public class TestStatic {

	static int a;
	//��̬�����Ժͷ����ڶ��е����洢
	//
	String name;
	
	public static void getA() {
		//��̬�����������÷Ǿ�̬name
		//name="��ɽ";
		System.out.println(a);
	}
	public void say() {
		//�Ǿ�̬�ķ������Ե��þ�̬�ķ���������
		a=123;
		getA();
		System.out.println("���"+name);
	}
	
	public static void main(String[]args) {
		TestStatic.a=123123;
		System.out.println(TestStatic.a);
	}
}
