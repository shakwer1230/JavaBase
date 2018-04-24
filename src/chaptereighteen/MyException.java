/**
 * 
 */
package chaptereighteen;

import java.io.IOException;

/**
 * 自定义异常
 * @author shakwer
 *
 */
public class MyException extends Exception {
	public MyException() {
		super();
	}
	public MyException(String s) {
		super(s);
	}
	
	
}

class TestMyException {
    static	void test()throws MyException{
		
	}
	public static void main(String[] args) {
		try {
			test();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
