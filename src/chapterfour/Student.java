/**
 * this 指针
 */
package chapterfour;

/**
 * @author shakwer
 *
 */
public class Student {

	String name;
	int age;
	static int grand;
	
	public Student(String name) {
		this.name=name;
	}
	
	public Student(String name,int age) {
		this(name);//通过this调用上一个声明的构造函数
		this.age=age;
	}
	public void study() {
		
	}
	public static void prindGrand() {
		System.out.println(grand);
	}
}
