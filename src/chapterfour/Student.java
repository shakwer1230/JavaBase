/**
 * this ָ��
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
		this(name);//ͨ��this������һ�������Ĺ��캯��
		this.age=age;
	}
	public void study() {
		
	}
	public static void prindGrand() {
		System.out.println(grand);
	}
}
