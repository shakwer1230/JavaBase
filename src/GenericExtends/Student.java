/**
 * 
 */
package GenericExtends;

/**
 * ������
 * 1������--> ������д��ĸ
 *   T type
 *   K��V key value
 *   E element
 * 2�����Ͳ��ܶ����ھ�̬�����ϡ�
 * 
 * 3��ָ�������Ͳ����ǻ�������
 * @author shakwer
 *
 */
public class Student<T> {

	private T mark;
	
//	public static T s;//���Ͳ��ܶ����ھ�̬�����ϣ�

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
