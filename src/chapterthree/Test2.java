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
		s1.name="张山";
		
		Computer c=new Computer();
		c.brand="联想";
		c.speed=100;
		
		s1.computer=c;
		
		System.out.println(s1.computer.brand);
		
		String string="联想";
		System.out.println(string==c.brand);
	}

}
