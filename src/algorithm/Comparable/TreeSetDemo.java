/**
 * 
 */
package algorithm.Comparable;

import java.util.TreeSet;

/**
 * @author shakwer
 *treeset��Ҫ�޸����ݣ�����ܳ����ظ�
 *����person�಻���޸� ����ʹ��final������
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		
		Person p1=new Person("��",100);
		Person p2=new Person("���»�",1000);
		Person p3=new Person("����ΰ",1200);
		Person p4=new Person("��ɽ",50);
		TreeSet<Person>persons=new TreeSet<>(
				//�����ڲ��� ʵ��comparator��comparato����  ҵ������
				new java.util.Comparator<Person>(){

					@Override
					public int compare(Person o1, Person o2) {
						// TODO Auto-generated method stub
						
						return o1.getHandsome()-o2.getHandsome();
					}
					
				}
				);
		//��ӵ�ʱ���������
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		System.out.println(persons);
		
		//�ٴ��޸ĵ�ʱ��  ����˳�򲻻�ı�
		p2.setHandsome(-100);
		System.out.println(persons);
		
		p1.setName("����ΰ");
		p1.setHandsome(10000);
		System.out.println(persons);
		
		
		
		System.out.println("##################################");
		Worker w1=new Worker("��������Ա", 1000);
		Worker w2=new Worker("ũ��", 2000);
		Worker w3=new Worker("�ܲ�", 30000);
		
		TreeSet workers=new TreeSet<>();
		workers.add(w1);
		workers.add(w2);
		workers.add(w3);
		System.out.println(workers);
		
	}
}
