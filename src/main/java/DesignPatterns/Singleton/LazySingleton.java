package DesignPatterns.Singleton;

public class LazySingleton {

    /**
     * static instance to hold the global single instance of this class, so the static method can access it
     * Marked as volatile, to ensure all the threads are notified when this field is changed
     */
    private volatile static LazySingleton instance;

    /**
     * private constructor to restrict outside classes to create new instances
     */
    private LazySingleton() {

    }

    /**
     * public static method for external classes to get the global instance of this class
     * @return global instance of Singleton
     */

    /**
     * This method is not thread safe and can lead to creation of multiple objects in multithreaded env
     *
     * public static LazySingleton getInstance() {
     *         if(instance == null) {
     *             instance = new LazySingleton();
     *         }
     *         return instance;
     *     }
     */

    /**
     * One solution is to make this method synchronized, this will ensure thread safety
     * but making the entire method synchronized will cause a performance hit
     *
     * public synchronized static LazySingleton getInstance() {
     *         if(instance == null) {
     *             instance = new LazySingleton();
     *         }
     *         return instance;
     *     }
     */

    /**
     * A more efficient way is to implement it by using "Double checked locking"
     * Now the synchronization is applied not at the method level but only at the critical section
     * of creating the object
     */

    public static LazySingleton getInstance() {
      if(instance == null) {
          synchronized(LazySingleton.class) {
              if(instance == null) {
                  instance = new LazySingleton();
              }
          }
     }
        return instance;
  }


}
