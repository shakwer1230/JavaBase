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
//非静态内部类 只能存储于外部类的某个对象
public class Outer {

	public static void main(String[]arfs) {
		//不能直接new 内部类
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
	//非静态内部类
	class Nose{
		int type;
		
		void breath() {
			System.out.println(Face.this.type);//调用外部内的属性 
			System.out.println(size);//调用外部内的属性
			System.out.println(this.type);//调用内部类的属性
			System.out.println("呼吸");
		}
	}
	//内部静态类
	static class Ear{
		void listen() {
			//不能调用外部内的非静态成员
			//System.out.println(size);//调用外部内的属性
			//可以调用外部类的静态成员
			System.out.println(shape);
			System.out.println("我在听");
		}
	}
	
}