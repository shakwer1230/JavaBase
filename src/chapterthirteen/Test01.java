/**
 * 
 */
package chapterthirteen;

/**
 * @author shakwer
 *
 */
public class Test01 {
	public static void main(String[]args) {
		StringBuilder sb=new StringBuilder();//字符数组默认16位
		StringBuilder sb1=new StringBuilder(30);//字符数组默认30位
		StringBuilder sb2=new StringBuilder("abcd");//16+4=20
		sb2.append("123");
		sb.append(true);
		sb.append("123").append("rrr");//每个append return this指针
		System.out.println(sb);
		
		System.out.println("#########生成一不少1个对象,但每次扩容后 老数组对象回收#######");
		StringBuilder gh=new StringBuilder("a");
		for(int i=0;i<1000;i++) {
			gh.append(i);
		}
	}
}
