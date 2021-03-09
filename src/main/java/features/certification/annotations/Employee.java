package features.certification.annotations;

@DBTable(table = "TBEmployee")
public class Employee extends Person {

    @DBField(column = "num_ctps")
    String ctps;

    public Employee(String name, String address, int age, String ctps) {
        super(name, address, age);
        this.ctps = ctps;
    }
}