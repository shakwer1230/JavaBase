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
		
		//Animal 类中午catchMouse方法
		//cat.catchMouse();
		//强制类型转换 才能调用子类的方法
		Cat cat2=(Cat)cat;
		cat2.catchMouse();
		
		//强制类型转换失败
		//Cat cat3=(Cat)dog;
		//cat3.seeDoor()
	}
}
