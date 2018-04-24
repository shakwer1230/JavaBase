/**
 * 
 */
package chapterseveteen;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author shakwer
 *
 */
public class TestFile {
	public static void main(String[] args) {
		String pathname="E:/WorkSpace4Java/chapterone/src/chapterseveteen/introduction.txt";
		File file=new File(pathname);
		File file2=new File("E:/WorkSpace4Java/chapterone/src/chapterseveteen");
		File file3=new File(file2,"introduction.txt");
		
		if(file.isFile()) {
			System.out.println("是一个文件");
		}
		if(file.isDirectory()) {
			System.out.println("是一个路径");
		}
		
		File file4=new File(file2,"test.txt");
		try {
			file4.createNewFile();//创建文件
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		file4.delete();//删除文件
		
		File file5=new File("D:/dddd");
		file5.mkdir();//创建单级目录
		file5.mkdirs();//创建多级目录
	}

}
