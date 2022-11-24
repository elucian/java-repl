public class Varargs {

  //input & output parameter
  public static void test(Integer ... args) {
    for (int x: args) {
      System.out.print(x);
      System.out.print(",");
     }
     System.out.println("");
  }
}