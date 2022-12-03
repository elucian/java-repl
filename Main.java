import static java.lang.System.out;

class Main {
  private static Calculator.IntegerMath addition;
  private static Calculator.IntegerMath subtraction;
  private static Calculator myApp;

  public static void print_menu() {
    clear();
    out.println("-".repeat(30));
    out.println("Options!");
    out.println("-".repeat(30));
    out.println("0 - Exit");
    out.println("1 - Clear console");
    out.println("2 - Compute");
    out.println("3 - Palindrome");
    out.println("4 - Varargs");
    out.println("5 - Switch expression");
    out.println("6 - Filter test");
    out.println("7 - Runnable test");
    out.println("8 - Stream test");
    out.println("9 - Interface demo");   
    out.println("-".repeat(30));
  }

  public static void main(String[] args) {
    int option = 1; // no option
    // prepare caclulator & operators
    myApp = new Calculator();

    // two lambda expressions
    addition = (a, b) -> a + b;
    subtraction = (a, b) -> a - b;

    // execution loop
    do {
      switch (option) {
        case 0:
          break; //exit          
        case 1:
          print_menu(); break;
        case 2:
          compute(); break;
        case 3:
          Palindrome.run(
              "murder for a jar of red rum");
          break;
        case 4:
          varargs(); break;
        case 5:
          SwitchXP.run(); break;
        case 6:
          Filter.test(); break;
        case 7:
          Runnables.test(); break;
        case 8:
          Stream.test(); break;
        case 9:
          InterfaceDemo.test(); break;
        case 10:
          InterfaceDefa.test(); break;
        default:
          out.format("option %d " +
              "not implemented.%n", option);
          break;
      }
      option = read_option();
    } while (option > 0);
    out.println("Have a nice day!");
  }

  /* test Varargs */
  private static void varargs() {
    out.print("test1: ");
    Varargs.test(1, 2, 3, 4);
    out.print("test2: ");
    Varargs.test(8, 12, 24);
    out.print("done");
  }

  /* option 2 calculator */
  private static void compute() {
    out.print("Operation:{ +, - }:>");
    String o = System.console().readLine();
    out.print("First operand:>");
    String s1 = System.console().readLine();
    int a = Integer.parseInt(s1);
    out.print("Second operand:>");
    String s2 = System.console().readLine();
    int b = Integer.parseInt(s2);
    int result = 0;
    if (o.equals("+")) {
      result = myApp.operateBinary(a, b, addition);
    } else if (o.equals("-")) {
      result = myApp.operateBinary(a, b, subtraction);
    } else {
      out.printf("Operation %s not implemented.\n", o);
      return;
    }
    out.printf("result = %d \n", result);
    out.println();
  }

  /* read user option selection */
  static Integer read_option() {
    out.print("option:>");
    String s = System.console().readLine();
    return Integer.decode(s);
  }

  /* cleanup the console window */
  static void clear() {
    out.print("\033[H\033[2J");
    out.flush();
  }

}