package chapterone;

/**
 * 测试switch jdk7新特性
 * case 字符串
 * 以前只有是int(byte short ) 和枚举
 * @author shakwer
 *
 */
public class TestSwitch {

	public static void main(String[]args) {
		String aString="吴鑫";
		switch (aString) {
		case "吴鑫":
			System.out.println("陕西人");
			break;

			
		default:
			System.out.println("非陕西人");
			break;
		}
	}
	
}
