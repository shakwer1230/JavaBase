/**
 * 
 */
package chapterten;

import java.awt.Shape;

import chapterten.Face.Nose;

/**
 * @author shakwer
 *
 */
//�Ǿ�̬�ڲ��� ֻ�ܴ洢���ⲿ���ĳ������
public class Outer {

	public static void main(String[]arfs) {
		//����ֱ��new �ڲ���
		//Nose nose =new Nose();
		Face face=new Face();
		Nose nose =face.new Nose();
		nose.breath();
		Face.Ear ear=new Face.Ear();
		ear.listen();
	}
}
class Face{
	int type;
	int  size;
	static String shape;
	//�Ǿ�̬�ڲ���
	class Nose{
		int type;
		
		void breath() {
			System.out.println(Face.this.type);//�����ⲿ�ڵ����� 
			System.out.println(size);//�����ⲿ�ڵ�����
			System.out.println(this.type);//�����ڲ��������
			System.out.println("����");
		}
	}
	//�ڲ���̬��
	static class Ear{
		void listen() {
			//���ܵ����ⲿ�ڵķǾ�̬��Ա
			//System.out.println(size);//�����ⲿ�ڵ�����
			//���Ե����ⲿ��ľ�̬��Ա
			System.out.println(shape);
			System.out.println("������");
		}
	}
	
}