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
		StringBuilder sb=new StringBuilder();//�ַ�����Ĭ��16λ
		StringBuilder sb1=new StringBuilder(30);//�ַ�����Ĭ��30λ
		StringBuilder sb2=new StringBuilder("abcd");//16+4=20
		sb2.append("123");
		sb.append(true);
		sb.append("123").append("rrr");//ÿ��append return thisָ��
		System.out.println(sb);
		
		System.out.println("#########����һ����1������,��ÿ�����ݺ� ������������#######");
		StringBuilder gh=new StringBuilder("a");
		for(int i=0;i<1000;i++) {
			gh.append(i);
		}
	}
}
