package jiangyu.pattern;

public class Test {
	public static void main(String[] args) {
		DataCenter dataCenter = new DataCenter();
		dataCenter.addObserver(new DataManager());
		dataCenter.addData();
	}
}
