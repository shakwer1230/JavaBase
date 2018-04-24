/**
 * java 继承
 * 1、只有单继承 不支持多重继承 只有一个直接的父类
 * 2、方法的重写 override  灵活扩充方法 在重写方法体内可以调用被重写的方法（super()调用） 但外部被重写的方法已经不能被调用（方法还是存）
 *    与被重写的方法 具有相同的方法名、参数列表、返回类型（重写的方法不能使用被重写的方法更严格的访问权限）
 * 3、构造器用super()默认调用父类的构造方法
 * 4、组合复用代码比继承更加灵活（见Animal2类）/继承符合建模属性，/添加属性 可使用组合
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
class Mammal extends Animal{
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
class Reptile extends Animal{
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
class Bird extends Reptile{
	
	
	/**
	 * run方法重写override
	 */
	public void run() {
		//调用父类的方法
		super.run();
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
	
	public Bird() {
		//构造器用super()默认调用父类的构造方法 
		//写或者不写super() 一样调用父类的构造方法
		super();
		System.out.println("这是鸟的构造器");
	}
}
