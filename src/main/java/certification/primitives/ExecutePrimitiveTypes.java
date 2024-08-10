package certification.primitives;

@SuppressWarnings("All")
public class ExecutePrimitiveTypes {

    public static void execute() {


        int x = 1, y = 1, z = 0;
        if (x == y | x < ++y) {
            z = x + y;
        } else {
            z = 1;
        }
        System.out.println(z); // 3
    }
}