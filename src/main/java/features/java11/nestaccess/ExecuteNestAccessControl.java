package features.java11.nestaccess;

import java.lang.reflect.Method;

public class ExecuteNestAccessControl {

    public void myPublicMethod() {
        System.out.println("myPublicMethod");
    }

    private void myPrivateMethod() {
        System.out.println("myPrivateMethod");
    }

    class Nested {
        public void nestedPublic() {
            myPublicMethod();
            myPrivateMethod();
        }
    }

    public void execute() {
        Nested nested = new Nested();

        try {

            // before java 11 was not possible to access nest access method by reflection
            Method method = nested.getClass().getDeclaredMethod("myPrivateMethod");
            method.invoke(nested);

        } catch (Exception e) {
            System.out.println("Reflection error");
        }

    }
}
