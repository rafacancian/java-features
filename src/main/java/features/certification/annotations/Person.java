package features.certification.annotations;

@DBTable(table = "TBPerson")
public class Person {

    @DBField(column = "str_name")
    private String name;

    @DBField(column = "str_end")
    private String address;

    @DBField
    private int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }


}