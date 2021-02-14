package com.java.features.java12.switchexpression;


public class ExecuteSwitchExpression {

    public static void execute() {
        String day = "T";
        before(day);
        now(day);
    }

    private static void before(String day) {
        String result = "";
        switch (day) {
            case "M":
            case "W":
            case "F": {
                result = "MWF";
                break;
            }
            case "T":
            case "TH":
            case "S": {
                result = "TTS";
                break;
            }
        }
        System.out.println("Old Switch Result: " + result);
    }

    private static void now(String day) {

        // Just allow to java 12
/*        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";

            default -> {
                if (day.isEmpty()) {
                    break "Please insert a valid day";
                } else {
                    break "Looks like a Sunday";
                }
            }
        };
        System.out.println("New Switch Result: " + result);*/
    }
}
