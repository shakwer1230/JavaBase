/**
 * 
 */
package singleton;

/**����ģʽ
 * ����ģʽ
 * @author shakwer
 *���ַ�ʽ����classloder���Ʊ����˶��̵߳�ͬ�����⣬������instance����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣��ڵ���ģʽ�д�������ǵ���getInstance������ ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ���ʱ���ʼ��instance��Ȼû�дﵽlazy loading��Ч����
 */
public class Singleton3 {
	private static Singleton3 instance=new Singleton3();
	private Singleton3() {}
	public static Singleton3 getInstance() {
		return instance;
	}
	
}
