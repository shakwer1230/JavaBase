/**
 * 面向对象 学生类
 * 
 */
package chapterthree;

import java.math.BigDecimal;

/**
 * @author shakwer
 *
 */
public class Student {
	 String name;
	 int id;
	 int age;
	 String gender;
	 int weight;
	private boolean isGood;
	private float mark;
	private double total;
	private byte sys;
	private short sh;
	private char cc;
	
	
	Computer computer;
	
	/**
	 * 学习方法
	 * 
	 */
	public void study() {
		System.out.println(this.name +" 在学习");
	}
	/**
	 * 问好方法
	 * @param sName
	 */
	public void sayHello(String sName) {
		System.out.println(this.name+" 向 "+sName+" 问好");
	}
	public void testDefault() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(isGood);
		System.out.println(sys);
		System.out.println(sh);
		System.out.println(cc);
		System.out.println(mark);
		System.out.println( (new BigDecimal(Float.MIN_VALUE)).toString() +"-"+Float.MAX_VALUE);
		System.out.println(total);
		System.out.println(Double.MIN_VALUE+"-"+Double.MAX_VALUE);
	}
	
	
}
