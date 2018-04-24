/**
 * java 组合完成代码复用
 * 添加类的属性 使用组合
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
		//通过super()调用父类的构造方法
		super();
		System.out.println("动物构造方法");
	}
}

/**
 * 哺乳动物
 * @author shakwer
 *
 */
class Mammal2  {
	Animal2 animal2;
	/**
	 * 胎生
	 */
	public void vivipation() {
		System.out.println("胎生");
	}
}

/**
 * 爬行动物
 * @author shakwer
 *
 */
class Reptile2  {
	Animal2 animal2;
	/**
	 * 卵生
	 */
	public void oviparity() {
		System.out.println("卵生");
	}
}

/**
 * 鸟
 * @author shakwer
 *
 */
class Bird2 {
	
	Reptile2 reptile2;
	Animal2 animal2=new Animal2();
	/**
	 * run方法重写override
	 */
	public void run() {
		//调用父类的方法

		System.out.println("two leg but use wing");
	}
	/**
	 * oviparity方法重写override
	 */
	public void oviparity() {
		System.out.println("蛋生");
	}
	public void fly() {
		System.out.println("fly");
	}
	/**
	 * 不能改小被重写的方法的权限
	 */
//	private void eat() {
//		System.out.println("bird eat");
//	}
	
	public Bird2() {
	super();
	animal2.run();
		System.out.println("这是鸟的构造器");
	}
}
