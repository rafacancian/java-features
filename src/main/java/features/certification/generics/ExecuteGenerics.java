package features.certification.generics;

public class ExecuteGenerics {

    public static void execute() {

        Some<String> someString = new Some<>("Rafael");
        Some<Long> someLong = new Some<>(1L);

        someString.operationWithGenerics();
        someLong.operationWithGenerics();
    }
}
