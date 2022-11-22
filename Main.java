import static java.lang.System.out;

class Main {
 public static void print_menu() {
    clear(); 
    out.println("-".repeat(30));
    out.println("Account Management!");
    out.println("-".repeat(30));
    out.println("0 - Clear console"); 
    out.println("1 - Hello World");         
    out.println("9 - Exit"); 
    out.println("-".repeat(30));    
  }
  
  public static void main(String[] args) {
    int option  = 0;
    do {
      switch (option) {
        case 0:
          print_menu(); break;
        case 1:
          out.println("Hello World");
          break;
        case 9:break;          
        default:
          out.format("option %d " +
                     "not implemented.%n",option);
          break;
      }
      option = read_option();       
    } while (option < 9);      
    out.println("Have a nice day!");
  }
  
  static Integer read_option() {
    out.print("run:>");  
    String s = System.console().readLine();
    return Integer.parseInt(s);         
  }

  static void clear()   
  {
    out.print("\033[H\033[2J");  
    out.flush();  
  }
  
}