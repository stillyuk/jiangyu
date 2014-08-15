package jiangyu.pattern;

import java.util.Observable;

/**
 * @author jiangyukun
 * @since 2014-08-15 14:56
 */
public class DataCenter extends Observable {
	public void addData() {
		System.out.println("DataCenter store Data");
		setChanged();
		notifyObservers();
	}
}
