/**
 * java �����ɴ��븴��
 * ���������� ʹ�����
 * 
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class Animal2 {

	String eye;
	public void run() {
		System.out.println("run");
	}
	public void eat() {
		System.out.println("eat");
	}
	
	public Animal2() {
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
class Mammal2  {
	Animal2 animal2;
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
class Reptile2  {
	Animal2 animal2;
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
class Bird2 {
	
	Reptile2 reptile2;
	Animal2 animal2=new Animal2();
	/**
	 * run������дoverride
	 */
	public void run() {
		//���ø���ķ���

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
	
	public Bird2() {
	super();
	animal2.run();
		System.out.println("������Ĺ�����");
	}
}
