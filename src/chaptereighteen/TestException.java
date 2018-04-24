/**
 * 
 */
package chaptereighteen;

import java.util.Scanner;

/**
 * @author shakwer
 *
 */
public class TestException {

	public static void main(String[] args) {
		//java.lang.ArithmeticException
		//int i=1/0;
		
//		Computer computer=null;
//		//java.lang.NullPointerException
//		computer.start();
		
//		Scanner scanner=new Scanner(System.in);
//		int a=scanner.nextInt();
//		//ÊäÈë×Ö·û³öÏÖjava.util.InputMismatchException
		
//		String string="12313dsad";
//		//java.lang.NumberFormatException
//		Integer integer=new Integer(string);
		
		
		
		//checked exception
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}

class Computer{
	void start() {
		System.out.println("the machine is starting");
	}
}
