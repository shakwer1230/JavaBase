/**
 * 
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class Test {
	
	public static void testAnimalVoice(Animal animal) {
		if(animal instanceof Cat) {
			((Cat)animal).catchMouse();
		}
		if(animal instanceof Dog) {
			((Dog)animal).seeDoor();
		}
		animal.voice();
	}
	public static void main(String[]args) {
		Animal cat=new Cat();
		testAnimalVoice(cat);
		
		Animal dog=new Dog();
		testAnimalVoice(dog);
		
		Animal pig=new Pig();
		testAnimalVoice(pig);
		
		//Animal ������catchMouse����
		//cat.catchMouse();
		//ǿ������ת�� ���ܵ�������ķ���
		Cat cat2=(Cat)cat;
		cat2.catchMouse();
		
		//ǿ������ת��ʧ��
		//Cat cat3=(Cat)dog;
		//cat3.seeDoor()
	}
}
