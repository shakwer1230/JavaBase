/**
 * 
 */
package Generic;

/**
 * ����ʱָ��ʹ������
 * �����ǻ�������
 * 
 * @author shakwer
 *
 */
public class StudentApp {

	public static void main(String[] args) {
		Student<Integer>student=new Student<Integer>(80);
		Student<String>student2=new Student<String>("����");
		
		System.out.println(student.getMark());
		System.out.println(student2.getMark());
	}
}
