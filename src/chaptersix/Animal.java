/**
 * ��̬
 * �̳к���дʵ�ֶ�̬
 * ���������ָ������Ķ���
 * 1.����ʱ
 * 2.����
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class Animal {
	public void voice() {
		System.out.println("��ͨ�������");
	}
}

class Cat extends Animal{
	public void voice() {
		System.out.println("����");
	}
	public void catchMouse() {
		System.out.println("ץ����");
	}
}
class Dog extends Animal{
	public void voice() {
		System.out.println("����");
	}
	public void  seeDoor() {
		System.out.println("����");
	}
}

class Pig extends Animal{
	public void voice() {
		System.out.println("�ߺ�");
	}
	

}