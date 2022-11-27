import java.util.*;

public class Filter {
  // Driver code
  public static void test()
  {
    // Creating a list of Integers
    List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

    // elements that are divisible by 2
    list.stream().filter (
         num -> num % 2 == 0).forEach(System.out::println);
  }
}