/**
 * 
 */
package chapterthree;

/**
 * @author shakwer
 *
 */
public class Point {
	public double x;
	public double y;
	public double z;
	
	/**
	 * ������
	 * @param x
	 * @param y
	 * @param z
	 */
	public Point(double x, double y,double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	/**
	 * �������Է���
	 * @param x
	 */
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=x;
	}
	public void setZ(double z) {
		this.z=z;
	}
	
	public double getDistanc(Point point1,Point point2) {
		
		//Math.sqrt(a); ��ƽ��
        //Math.pow(a, b); a��b�η�
		double distance=Math.sqrt((point1.x-point2.x)*(point1.x-point2.x)+(point1.y-point2.y)*(point1.y-point2.y)+(point1.z-point2.z)*(point1.z-point2.z));
		return distance;
	}
	public static void main(String []ars) {
		Point point1=new Point(3, 4, 8);
		Point point2=new Point(0, 0, 0);
		System.out.println(point1.x);
		System.out.println(point1.getDistanc(point1, point2));
		
	}

}
