/**
 * 
 */
package chaptereight;

/**
 * @author shakwer
 *
 */
public interface Flyable {
	int MAX_SPEED=11000;
	int MAX_HEIGHT=1;
	
	void fly();
}
interface Attack{
	void attck();
}

class Plane implements Flyable{
	public void fly() {
		System.out.println("�ɻ��������������");
	}
}

class Man implements Flyable{
	public void fly() {
		System.out.println("���� ..���");
	}
}

class Stone implements Flyable,Attack{
	public void fly() {
		System.out.println("����..���");
	}
	
	/* (non-Javadoc)
	 * @see chaptereight.Attack#attck()
	 */
	@Override
	public void attck() {
		// TODO Auto-generated method stub
		System.out.println("С��..��ʯͷ����");
	}
}
