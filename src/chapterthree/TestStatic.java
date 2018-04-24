/**
 * 
 */
package chapterthree;

/**
 * @author shakwer
 *
 */
public class TestStatic {

	static int a;
	//静态的属性和方法在堆中单独存储
	//
	String name;
	
	public static void getA() {
		//静态方法不能引用非静态name
		//name="张山";
		System.out.println(a);
	}
	public void say() {
		//非静态的方法可以调用静态的方法和属性
		a=123;
		getA();
		System.out.println("你好"+name);
	}
	
	public static void main(String[]args) {
		TestStatic.a=123123;
		System.out.println(TestStatic.a);
	}
}
