/**
 * 
 */
package chapterseven;

/**
 * 抽象类 
 * 
 * @author shakwer
 *
 */
public abstract class Animal {
	/**
	 * 抽象类中可以包含非抽象的属性
	 */
	String name;
	/**
	 * 抽象类中可以包含非抽象的方法
	 */
	public void breath() {
		System.out.println("呼吸");
		//System.out.println(name);
		//非抽象的方法可以调用抽象的方法
		run();
	}
	
	//抽象类中可以定义构造方法  但不能被直接调用生成对象
	public Animal() {
		System.out.println("创造一个动物");
	}
	/**
	 * 抽象方法
	 */
	public abstract void  run();
	
}

class Cat extends Animal{
	@Override
	public void run() {
		System.out.println("猫步小跑");
	}
}

class Dog extends Animal{
	@Override
	public void run() {
		System.out.println("狗步小跑");
	}
}
