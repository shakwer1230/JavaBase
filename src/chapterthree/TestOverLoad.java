/**
 * 
 */
package chapterthree;

/**
 * @author shakwer
 *
 */
public class TestOverLoad {

	public static void main(String[]arfs) {
		MyMath math=new MyMath();
		int result1=math.add(1, 2);
		System.out.println(result1);
	}
}


class MyMath{
	
	public int add(int a,int b) {
		return a+b;
	}
	//����ֵ��ͬ����������
//	public double add(int a,int b) {
//		return a+b;
//	}
	/**
	 * �������Ͳ�ͬadd����
	 * @param a
	 * @param b
	 * @return
	 */
	public double add(int a,Double b) {
		return a+b;
	}
	/**
	 * ����˳��ͬ��������
	 * @param b
	 * @param a
	 * @return
	 */
	public double add(Double b,int a) {
		return a+b;
	}
	
	/**
	 * ����������ͬ�������� add
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int add(int a,int b,int c) {
		return a+b+c;
	}
}
