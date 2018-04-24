/**
 * java �̳�
 * 1��ֻ�е��̳� ��֧�ֶ��ؼ̳� ֻ��һ��ֱ�ӵĸ���
 * 2����������д override  ������䷽�� ����д�������ڿ��Ե��ñ���д�ķ�����super()���ã� ���ⲿ����д�ķ����Ѿ����ܱ����ã��������Ǵ棩
 *    �뱻��д�ķ��� ������ͬ�ķ������������б��������ͣ���д�ķ�������ʹ�ñ���д�ķ������ϸ�ķ���Ȩ�ޣ�
 * 3����������super()Ĭ�ϵ��ø���Ĺ��췽��
 * 4����ϸ��ô���ȼ̳и�������Animal2�ࣩ/�̳з��Ͻ�ģ���ԣ�/������� ��ʹ�����
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class Animal {

	String eye;
	public void run() {
		System.out.println("run");
	}
	public void eat() {
		System.out.println("eat");
	}
	
	public Animal() {
		//ͨ��super()���ø���Ĺ��췽��
		super();
		System.out.println("���ﹹ�췽��");
	}
}

/**
 * ���鶯��
 * @author shakwer
 *
 */
class Mammal extends Animal{
	/**
	 * ̥��
	 */
	public void vivipation() {
		System.out.println("̥��");
	}
}

/**
 * ���ж���
 * @author shakwer
 *
 */
class Reptile extends Animal{
	/**
	 * ����
	 */
	public void oviparity() {
		System.out.println("����");
	}
}

/**
 * ��
 * @author shakwer
 *
 */
class Bird extends Reptile{
	
	
	/**
	 * run������дoverride
	 */
	public void run() {
		//���ø���ķ���
		super.run();
		System.out.println("two leg but use wing");
	}
	/**
	 * oviparity������дoverride
	 */
	public void oviparity() {
		System.out.println("����");
	}
	public void fly() {
		System.out.println("fly");
	}
	/**
	 * ���ܸ�С����д�ķ�����Ȩ��
	 */
//	private void eat() {
//		System.out.println("bird eat");
//	}
	
	public Bird() {
		//��������super()Ĭ�ϵ��ø���Ĺ��췽�� 
		//д���߲�дsuper() һ�����ø���Ĺ��췽��
		super();
		System.out.println("������Ĺ�����");
	}
}
