/**
 * 
 */
package Generic;

/**
 * ���ͽӿ�
 * ���Ͳ���ʹ��ȫ�ֵĳ�����
 * 
 * @author shakwer
 *
 */
public interface Comparator<T> {
	//ȫ�ֳ���
	//���Ͳ��ܶ����ڽӿڵ�ȫ�ֳ�����
	///*public static final*/�ӿ�����δ����ʡ��
	/*public static final*/ int MAX_NUM=100;
	
	//ȫ�ַ��� �����ĳ��󷽷�
	///*public abstract */�ӿ�����δ����ʡ��
	/*public abstract */void Compare(T t);
	
}
