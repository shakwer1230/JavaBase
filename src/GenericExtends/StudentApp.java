/**
 * 
 */
package GenericExtends;

import javax.security.auth.Subject;

/**
 * 泛型擦除：使用|实现|继承 没有指定类型
 * @author shakwer
 *
 */
public class StudentApp {
   public static void main(String[] args) {
	Student student=new Student();
	student.setMark(100);
	
	test(student);
	Student<Object> student2=new Student<Object>();
	//不等同于Object
//	test(student2);
  }
   
   public static void test(Student<Integer>student) {
	   System.out.println("ddd");
   }
}
