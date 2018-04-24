/**
 * Å×³öÒì³£
 */
package chaptereighteen;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author shakwer
 *
 */
public class TestException3 {

	public static void main(String[] args) {
		try {
			openFile("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String openFile(String filePath) throws FileNotFoundException ,IOException{
	    FileReader	reader=new FileReader("e:/hello.txt");
	    char c=(char)reader.read();
	    return "";
	}
}
