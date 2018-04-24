/**
 * 
 */
package singleton;

/**����ģʽ
 * ����ģʽ-�̰߳�ȫ
 * @author shakwer
 *����д���ܹ��ڶ��߳��кܺõĹ��������ҿ�������Ҳ�߱��ܺõ�lazy loading�����ǣ��ź����ǣ�Ч�ʺܵͣ�99%����²���Ҫͬ����
 */
public class Singleton2 {
	private static Singleton2 instance;
	private Singleton2() {}
	public static synchronized Singleton2 getInstance() {
		if(instance==null) {
			instance=new Singleton2();
		}
		return instance;
	}
}
