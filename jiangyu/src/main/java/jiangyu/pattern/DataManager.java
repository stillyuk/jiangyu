package jiangyu.pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jiangyu
 * @since 2014-08-15 15:01
 */
public class DataManager implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("DataManager say ok");
	}
}
