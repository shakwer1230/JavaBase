/**
 * 
 */
package chapterthree;

import javax.sql.rowset.serial.SerialStruct;

/**
 * @author shakwer
 *
 */
public class Test2 {
	public static void main(String[]args) {
		Student s1=new Student();
		s1.age=18;
		s1.name="��ɽ";
		
		Computer c=new Computer();
		c.brand="����";
		c.speed=100;
		
		s1.computer=c;
		
		System.out.println(s1.computer.brand);
		
		String string="����";
		System.out.println(string==c.brand);
	}

}
