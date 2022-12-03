interface PrintDemo {
 
    // Static Method
    static void hello()
    {
        System.out.println("Called from Interface PrintDemo");
    }
}
 
public class InterfaceDemo implements PrintDemo {
 
    public static void test()
    {
 
        // Call Interface method as Interface
        // name is preceding with method
        PrintDemo.hello();
 
        // Call Class static method
        hello();
    }
 
    // Class Static method is defined
    static void hello()
    {
        System.out.println("Called from Class");
    }
}