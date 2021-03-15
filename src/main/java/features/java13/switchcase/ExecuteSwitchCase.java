package features.java13.switchcase;

public class ExecuteSwitchCase {

    public static void execute() {

        String returnCase1 = getNumberViaCaseL(2);
        System.out.println("First switch case example: " + returnCase1);
        String returnCase2 = getNumberViaCaseL2(4);
        System.out.println("Second switch case example: " + returnCase2);
    }

    private static String getNumberViaCaseL(int number) {
        return switch (number) {
            case 1, 2 -> "one or two";
            case 3 -> "three";
            case 4, 5, 6 -> "four or five or six";
            default -> "unknown";
        };
    }

    private static String getNumberViaCaseL2(int number) {
        return switch (number) {
            case 1, 2 -> "one or two";
            case 3 -> "three";
            case 4, 5, 6 -> {
                int i = 0;
                i++;
                yield "four or five or six :" + 1;
            }
            default -> "unknown";
        };
    }
}
