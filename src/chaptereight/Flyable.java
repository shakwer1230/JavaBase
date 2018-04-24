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
		System.out.println("飞机依靠发动机起飞");
	}
}

class Man implements Flyable{
	public void fly() {
		System.out.println("起跳 ..起飞");
	}
}

class Stone implements Flyable,Attack{
	public void fly() {
		System.out.println("翻滚..起飞");
	}
	
	/* (non-Javadoc)
	 * @see chaptereight.Attack#attck()
	 */
	@Override
	public void attck() {
		// TODO Auto-generated method stub
		System.out.println("小心..被石头攻击");
	}
}
