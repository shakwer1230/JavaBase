/**
 * 
 */
package chapternine;

import java.awt.Frame;

/**
 * @author shakwer
 *
 */
public class PaintFrame {
	public static void  drawFrame(IMyFrame frame) {
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣ");
		
		frame.paint();
		
		System.out.println("�������棬����Ч��");
	}
	
	public static void main(String[]aa) {
		drawFrame(new GameFrame());
//		�����߳�
//		����ѭ��
//		�鿴��Ϣ
//		���Լ���GameFrame���ڻ�����
//		�������棬����Ч��
	}
}


//class GameFrame extends MyFrame{
//	public void paint() {
//		System.out.println("���Լ���GameFrame���ڻ�����");
//	}
//}

class GameFrame implements IMyFrame{
	public void paint() {
		System.out.println("���Լ���GameFrame���ڻ�����");
	}
}
