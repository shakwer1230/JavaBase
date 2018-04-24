/**
 *多态
 * 每个方法都包含this和super指针 (this,super)
 */
package chaptersix;

/**
 * @author shakwer
 *
 */
public class TestServlet {
	public static void main(String[]args) {
		HtppServlet servlet=new MyServlets();
		//调用父类的service方法
		//调用子类的doGet方法
		servlet.service();
		
		//输出
		//HtppServlet.service()
		//MyServlet.doGet()
	}
}
