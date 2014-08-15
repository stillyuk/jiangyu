package jiangyu.test;

/**
 * @author jiangyu
 * @since 2014-08-14 09:29
 */
public class Assert1 {
	public static void main(String[] args) {
		try {
			assert false : "assert";
		} catch (Throwable t) {
			t.printStackTrace();
		}
		System.out.println(1);
	}
}
