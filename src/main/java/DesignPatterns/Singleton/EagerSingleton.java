package DesignPatterns.Singleton;

public class EagerSingleton {

    /**
     * Creates the instance at the class load time, thread safe because now there is no way to create more objects
     */
    private static EagerSingleton instance = new EagerSingleton();

    /**
     * Private constructor to prevent object creation
     */
    private EagerSingleton() {

    }

    /**
     * Only deals with returning the instance, doesn't care about object creation.
     * This makes EagerSingleton thread safe by default, but should be use when we can afford to
     * create this object at class load time.
     * @return
     */
    public static EagerSingleton getInstance() {
        return instance;
    }
}
