/**
 * 
 */
package chaptereight;

/**
 * @author shakwer
 *
 */
public interface MyInterface {
	/**
	 * 常量
	 */
	String MAX_GREAD="BOSS";
	int MAX_SPEED=120;
	/**
	 * 不能定义变量
	 */
	//int num;
	
	/**
	 * 抽象方法
	 * @return
	 */
	public int test01();
	
	/**
	 * 抽象方法声明
	 * @param a
	 * @param b
	 * @return
	 */
	public int test2(int a,int b);
	
	/**
	 * 不能定义方法实现
	 * @return
	 */
	//public int test03() {}
}
