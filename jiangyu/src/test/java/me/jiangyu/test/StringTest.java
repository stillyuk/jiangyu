package me.jiangyu.test;

import org.junit.Test;

/**
 * @author jiangyukun
 * @since 2014-08-15 09:41
 */
public class StringTest {
	public static final int STRING_SIZE = 50000;

	/**
	 * StringBuilder's performance is best
	 */
	@Test
	public void testStringBuilder() {
		long start = System.currentTimeMillis();
		System.out.println(getClass().getClassLoader());
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < STRING_SIZE; i++) {
			stringBuilder.append("abcd");
		}
		System.out.println(System.currentTimeMillis() - start);
	}

	/**
	 * asychronized's StringBuilder
	 */
	@Test
	public void testStringBuffer() {
		long start = System.currentTimeMillis();
		System.out.println(getClass().getClassLoader());
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < STRING_SIZE; i++) {
			stringBuffer.append("abcd");
		}
		System.out.println(System.currentTimeMillis() - start);
	}

	/**
	 * don't use to compute large number String
	 */
	@Test
	public void testString() {
		long start = System.currentTimeMillis();
		String a = "";
		String str = a + "a" + "b";
		for (int i = 0; i < STRING_SIZE; i++) {
			str = str + "abcd";
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}
