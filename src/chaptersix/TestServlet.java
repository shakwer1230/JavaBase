/**
 *��̬
 * ÿ������������this��superָ�� (this,super)
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class TestServlet {
	public static void main(String[]args) {
		HtppServlet servlet=new MyServlets();
		//���ø����service����
		//���������doGet����
		servlet.service();
		
		//���
		//HtppServlet.service()
		//MyServlet.doGet()
	}
}
