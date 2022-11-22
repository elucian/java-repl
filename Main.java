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
    out.println("0 - Clear console");
    out.println("1 - Help");
    out.println("2 - Compute");
    out.println("9 - Exit");
    out.println("-".repeat(30));
  }

  public static void main(String[] args) {
    int option = 0; // no option
    // prepare caclulator & operators
    myApp = new Calculator();

    // two lambda expressions
    addition = (a, b) -> a + b;
    subtraction = (a, b) -> a - b;

    // execution loop
    do {
      switch (option) {
        case 0:
          print_menu();
          break;
        case 1:
          out.println("""
              This is a calculator,
              Work in progress.
              Enter a option (0 to 9) 
              for a quick test.""");
          break;
        case 2:
          compute();
          break;
        case 9:
          break;
        default:
          out.format("option %d " +
              "not implemented.%n", option);
          break;
      }
      option = read_option();
    } while (option < 9);
    out.println("Have a nice day!");
  }

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

  static Integer read_option() {
    out.print("option:>");
    String s = System.console().readLine();
    return Integer.parseInt(s);
  }

  static void clear() {
    //clear console
    out.print("\033[H\033[2J");
    out.flush();
  }

}