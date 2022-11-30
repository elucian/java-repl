import java.util.*;

public class Stream {

  public static void test() {
    List<Integer> listOfNumbers = new LinkedList<Integer>();
    /* populate the list */
    for (Integer i=10; i< 100; i+=2) {
      listOfNumbers.add(i);
    }
    /* visit elements in parallel */
    listOfNumbers.parallelStream().forEach(
      number -> System.out.println(
        number + " " + Thread.currentThread().getName()
      )
    );
  }
}