/**
 * 
 */
package GenericExtends;

import javax.security.auth.Subject;

/**
 * ���Ͳ�����ʹ��|ʵ��|�̳� û��ָ������
 * @author shakwer
 *
 */
public class StudentApp {
   public static void main(String[] args) {
	Student student=new Student();
	student.setMark(100);
	
	test(student);
	Student<Object> student2=new Student<Object>();
	//����ͬ��Object
//	test(student2);
  }
   
   public static void test(Student<Integer>student) {
	   System.out.println("ddd");
   }
}
