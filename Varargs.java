public class Varargs {

  // Symbol ... before parameter name
  // makes args a vararg receiver
  public static void test(Integer... args) {
    for (int x : args) {
      System.out.print(x);
      System.out.print(",");
    }
    System.out.println("");
  }
}