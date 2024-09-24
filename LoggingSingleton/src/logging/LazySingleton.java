package logging;

public class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			if (instance == null)
				instance = new LazySingleton();
		}
		return instance;

	}
}
