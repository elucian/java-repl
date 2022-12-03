interface PrintDefa {
 
    // Default Method
    default void hello()
    {
        System.out.println("Called from Interface");
    }
}


public class InterfaceDefa implements PrintDefa {
 
    public static void test()
    {
        // use anonymous object
        new InterfaceDefa().hello();
    }

    //default methods can be overwrite
    public void hello() {
        System.out.println("Hello from class");
    }
}