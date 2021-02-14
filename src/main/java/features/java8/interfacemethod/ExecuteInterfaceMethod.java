package features.java8.interfacemethod;

public class ExecuteInterfaceMethod {

    /**
     * From Java 8, interfaces are enhanced to have method with implementation. We can use default and static
     * keyword to create interfaces with method implementation. forEach method implementation in Iterable interface
     * <p>
     * We know that Java doesn’t provide multiple inheritance in Classes because it leads to Diamond Problem.
     * So how it will be handled with interfaces now, since interfaces are now similar to abstract classes.
     * The solution is that compiler will throw exception in this scenario and we will have to provide
     * implementation logic in the class implementing the interfaces.
     */

    public static void execute() {
        MyClass myClass = new MyClass();
        myClass.method1("method1");
        myClass.method2();
        myClass.log("log");
    }
}
