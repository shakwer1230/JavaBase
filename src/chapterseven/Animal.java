/**
 * 
 */
package chapterseven;

/**
 * ������ 
 * 
 * @author shakwer
 *
 */
public abstract class Animal {
	/**
	 * �������п��԰����ǳ��������
	 */
	String name;
	/**
	 * �������п��԰����ǳ���ķ���
	 */
	public void breath() {
		System.out.println("����");
		//System.out.println(name);
		//�ǳ���ķ������Ե��ó���ķ���
		run();
	}
	
	//�������п��Զ��幹�췽��  �����ܱ�ֱ�ӵ������ɶ���
	public Animal() {
		System.out.println("����һ������");
	}
	/**
	 * ���󷽷�
	 */
	public abstract void  run();
	
}

class Cat extends Animal{
	@Override
	public void run() {
		System.out.println("è��С��");
	}
}

class Dog extends Animal{
	@Override
	public void run() {
		System.out.println("����С��");
	}
}
