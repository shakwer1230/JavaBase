package chapterone;

public class TestRadom {
	public static void main(String[] args) {
		double d = Math.random();// 0-1֮
		int e = 1+(int) (d * 5); // 0-4

		System.out.println(e);
		if (e > 3) {
			System.out.println( e);
		}
		System.out.println(d);
	}

}
