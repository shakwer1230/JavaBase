/**
 * 
 */
package genericWildCards;

import java.util.ArrayList;
import java.util.List;

/**
 * ?---->ͨ��� ���Ͳ�ȷ��  ��������|�β���
 * �������� �������
 *  1����������
 *  2.���������ࡢ���ͷ��������ͽӿ�
 * @author shakwer
 *
 */
public class WildCardsTest {

	public static void main(String[] args) {
		//������
		List<?> list=new ArrayList<Integer>();
		list=new ArrayList<String>();
		list=new ArrayList<Object>();
		
		test(list);
		
		//��������
		//�������
//		list=new ArrayList<?>()��
	}
	//ͨ������β���
	public static void test(List<?>list) {
		
	}
}
