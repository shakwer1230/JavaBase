/**
 * 
 */
package chaptereighteen;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author shakwer
 *
 */
public class TestException2 {
	public static void main(String[] args) {
		FileReader reader=null;
		try {
			reader=new FileReader("e:/hello.txt");
			char str=(char)reader.read();
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(reader!=null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
