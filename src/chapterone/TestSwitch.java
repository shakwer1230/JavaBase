package chapterone;

/**
 * ����switch jdk7������
 * case �ַ���
 * ��ǰֻ����int(byte short ) ��ö��
 * @author shakwer
 *
 */
public class TestSwitch {

	public static void main(String[]args) {
		String aString="����";
		switch (aString) {
		case "����":
			System.out.println("������");
			break;

			
		default:
			System.out.println("��������");
			break;
		}
	}
	
}
