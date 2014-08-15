package jiangyu.test;

/**
 * @author jiangyukun
 * @since 2014-08-15 12:00
 */
public class IntervalClass {
	public static void main(String[] args) {
		new Thread(() -> {
				System.out.println();
				// can't use reserved key this
		}).start();
		System.out.println(1);
	}
}
