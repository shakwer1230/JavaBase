/**
 * 
 */
package chapterfifteen;

/**
 * @author shakwer
 *
 */
public class Test01 {

	/**
	 * 
	 */	
	public static void main(String[]as) {
		/**
		 *== �ڻ�����������ʱ�� �Ƚϵ�������������ֵ�����������ͣ��Ƚϵ�����������ĵ�ַ
		 *equal ��֧�ֻ����������ͣ��Ƚ����������������͵ĵ�ַ������String �� Date�� Wapper�� ������д�Ļ� �Ƚϵ�����ֵ
		 */
		Integer i1=123;
		Integer i2=123;
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		System.out.println("#########################");
		//С��-128 ����127���� ��Integer����Ķ�����װ����� ���ǻ�������������int
		Integer i3=134;
		Integer i4=134;
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
	 
		System.out.println("############################");
		int i5=10000;
		int i6=10000;
		System.out.println(i5==i6);
		//System.out.println(i5.equals(i6));//���벻��ͨ����������ǻ�������int
		
	}

}
