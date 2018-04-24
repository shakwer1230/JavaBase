/**
 * 
 */
package chapterseveteen;

import java.io.File;

/**
 * @author shakwer
 *
 */
public class FileTree {
	
	
	public static void main(String[] args) {
		File file=new File("C:\\Users\\shakwer\\Desktop\\eclipse");
		printTree(file,0);
	}
	
	public static void printTree(File file ,int level) {
		for(int i=0;i<level;i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		if(file.isDirectory()) {
			File[] files=file.listFiles();
			for(File temp :files) {
				printTree(temp, level+1);
			}
		}
	}

}
