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
			System.out.println("��һ���ļ�");
		}
		if(file.isDirectory()) {
			System.out.println("��һ��·��");
		}
		
		File file4=new File(file2,"test.txt");
		try {
			file4.createNewFile();//�����ļ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		file4.delete();//ɾ���ļ�
		
		File file5=new File("D:/dddd");
		file5.mkdir();//��������Ŀ¼
		file5.mkdirs();//�����༶Ŀ¼
	}

}
