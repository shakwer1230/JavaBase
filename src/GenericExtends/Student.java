/**
 * 
 */
package GenericExtends;

/**
 * 泛型类
 * 1、括号--> 单个大写字母
 *   T type
 *   K，V key value
 *   E element
 * 2、泛型不能定义在静态属性上。
 * 
 * 3、指定的类型不能是基本类型
 * @author shakwer
 *
 */
public class Student<T> {

	private T mark;
	
//	public static T s;//泛型不能定义在静态属性上，

	/**
	 * @param mark
	 */
	public Student(T mark) {
		super();
		this.mark = mark;
	}

	public Student() {
	
	}
	/**
	 * @return the mark
	 */
	public T getMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public void setMark(T mark) {
		this.mark = mark;
	}
	
	
}
