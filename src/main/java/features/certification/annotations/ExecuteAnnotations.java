package features.certification.annotations;

public class ExecuteAnnotations {

    public static void execute() {

        RepositoryAnnotation repository = new RepositoryAnnotation();

        Person p = new Person("Nelson", "Rua tal", 28);
        Employee f = new Employee("Glauber", "Rua x", 18, "1234");

        try {
            repository.insert(p);
            repository.insert(f);
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }
}
