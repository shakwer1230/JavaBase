/**
 * 
 */
package singleton;

/**����ģʽ
 * ����ģʽ(����)
 * @author shakwer
 *�����Ͽ��������ͦ����ʵ�������ַ�ʽ��࣬���������ʼ����ʵ����instance��
 */
public class Singleton4 {
	private  Singleton4 instance=null;
	
	static {
//		instance=new Singleton4();
	}
	private Singleton4() {}
	
//	public static Singleton4 getInstance() {
////		return this.instance;
//	}
}
