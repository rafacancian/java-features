package features.java8.interfacemethod;

public interface Interface2 {

    void method2();

    default void log(String log) {
        System.out.println("[I2] logging: " + log);
    }

    static void print(String string) {
        System.out.println("[I2] print: " + string);
    }

}
