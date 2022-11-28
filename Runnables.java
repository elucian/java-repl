public class Runnables {
  /*
   * this program do not run in parallel
   * actually we demonstrate just how to implement
   * runable interface using labda functions
   */

  /* wrapper for puting main thread to sleep */
  public static void sleep(int s) {
    try {
      Thread.sleep(s * 1000);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  public static void test() {
    System.out.println("=== RunnableTest ===");

    // Anonymous Runnable
    Runnable r1 = new Runnable() {

      @Override
      public void run() {
        sleep(3);
        System.out.println("Hello world one!");
      }
    };

    // Lambda Runnable
    Runnable r2 = () -> {
      sleep(1);
      System.out.println("Hello world two!");
    };

    // Run them!
    System.out.println("started");
    r1.run();
    r2.run();
    System.out.println("done");
  }
}