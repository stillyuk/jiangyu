package me.jiangyu.test;

import org.junit.Test;

/**
 * @author jiangyukun
 * @since 2014-08-15 11:01
 */
public class LamdaTest {
	private static boolean stop = false;

	@Test
	public synchronized void testLamda() {
		new Thread(() -> {
			while (!stop) {
				System.out.println("a");
			}
			synchronized(this) {
				System.out.println(this);
				notify();
			}
		}).start();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stop = true;
		System.out.println(this);
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
