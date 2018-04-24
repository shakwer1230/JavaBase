/**
 * 
 */
package Generic;

/**
 * 声明时指定使用类型
 * 不能是基本类型
 * 
 * @author shakwer
 *
 */
public class StudentApp {

	public static void main(String[] args) {
		Student<Integer>student=new Student<Integer>(80);
		Student<String>student2=new Student<String>("优秀");
		
		System.out.println(student.getMark());
		System.out.println(student2.getMark());
	}
}
