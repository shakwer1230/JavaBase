/**
 * �����﷨
 */
package chaptereleven;

/**
 * @author shakwer
 *
 */
public class Test02 {
	public static void main(String[]args) {
		//����
		int []a;
		int b[];
		//��������
		a=new int[4];
		b=new int[5];
		
		//��ʼ��
		//Ĭ�ϳ�ʼ��������Ԫ���൱�ڶ���ĳ�Ա������Ĭ�ϸ���Ա�����Ĺ���һ����boolean Ϊfalse��int Ϊ0��char "\\u"(0)
		//��̬��ʼ��
		a[0]=1;
		a[1]=23;
		for(int i=0;i<b.length;i++) {
			b[i]=i;
		}
		//��̬��ʼ��
		int[]c= {1,24,55,22};
		Car[] cars= {new Car("����"),new Car("���ǵ�"),new Car("����")};
		Car car=new Car("����");
		
		System.out.println(car.hashCode());
		System.out.println(cars[0].hashCode());
		System.out.println(car==cars[0]);
		System.out.println(car.equals(cars[0]));
		
		int i1=2;
		int i2=2;
		System.out.println(i1==i2);
		
	}
}
