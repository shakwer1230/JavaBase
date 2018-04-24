/**
 * 
 */
package chapterthree;

/**
 * @author shakwer
 *
 */
public class Test1 {
public static void main(String []args) {
		
		//1.通过类加载器加载class类（class代码(属性、方法)、static变量、常量池(比如代码中的字符串常量 会共享)） 存放堆中(方法区)
		//2.声明的局部变量 (student)存放栈中
		//3.new 构造器创建的对象 存放于堆中 对象中的方法指针指向堆中方法区的方法代码 
		// 将对象的引用（地址）赋值给变量
		// （每一个方法执行 开启一个栈帧，执行完毕 栈栈帧回收）
		//4.声明于栈中的变量通过指针指向堆中的对象
		
		//5.基本类型变量直接赋值，对象（string）赋值指针引用
		
		Student student=new  Student();
//		student.name="张山";
//		student.study();
//		student.sayHello("李四");
		student.testDefault();
	}

}
