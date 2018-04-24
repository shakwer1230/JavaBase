/**
 * 多态
 * 继承和重写实现多态
 * 父类的引用指向子类的对象
 * 1.编译时
 * 2.运行
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class Animal {
	public void voice() {
		System.out.println("普通动物叫声");
	}
}

class Cat extends Animal{
	public void voice() {
		System.out.println("喵喵");
	}
	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}
class Dog extends Animal{
	public void voice() {
		System.out.println("汪汪");
	}
	public void  seeDoor() {
		System.out.println("看门");
	}
}

class Pig extends Animal{
	public void voice() {
		System.out.println("哼哼");
	}
	

}