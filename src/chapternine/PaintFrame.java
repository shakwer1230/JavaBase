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
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息");
		
		frame.paint();
		
		System.out.println("启动缓存，增加效率");
	}
	
	public static void main(String[]aa) {
		drawFrame(new GameFrame());
//		启动线程
//		增加循环
//		查看消息
//		把自己的GameFrame窗口画出来
//		启动缓存，增加效率
	}
}


//class GameFrame extends MyFrame{
//	public void paint() {
//		System.out.println("把自己的GameFrame窗口画出来");
//	}
//}

class GameFrame implements IMyFrame{
	public void paint() {
		System.out.println("把自己的GameFrame窗口画出来");
	}
}
