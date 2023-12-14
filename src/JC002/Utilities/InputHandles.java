package JC002.Utilities;

import java.util.Scanner;

public class InputHandles {
    public static int inputInteger(Scanner scanner) {
        int inputInt;
        do {
            try {
                inputInt = Integer.parseInt(scanner.nextLine());
                return inputInt;
            } catch (NumberFormatException e) {
                System.err.println("Your value you entered must be integer, please try again.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public static String inputString(Scanner scanner) {
        String inputString = scanner.nextLine().trim().replaceAll("\\s+", " ");
        while (inputString.isEmpty()) {
            System.err.println("Input string must not be empty, please try again.");
            inputString = scanner.nextLine().trim().replaceAll("\\s+", " ");
        }
        return inputString;
    }

    public static float inputFloat(Scanner scanner) {
        float inputFloat;
        do {
            try {
                inputFloat = Float.parseFloat(scanner.nextLine());
                return inputFloat;
            } catch (NumberFormatException ex) {
                System.err.println("Your value you entered must be float, please try again.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public static boolean inputBoolean(Scanner scanner) {
        String booleanValue = scanner.nextLine().trim().replaceAll("\\s+"," ");
        while (!booleanValue.equalsIgnoreCase("true") && !booleanValue.equalsIgnoreCase("false")) {
            System.err.println("You must enter boolean value true/false, please try again.");
            booleanValue = scanner.nextLine().trim().replaceAll("\\s+"," ");
        }
        return Boolean.parseBoolean(booleanValue);
    }
    public static boolean inputConfirmValue(Scanner scanner){
        String booleanValue = scanner.nextLine().trim().replaceAll("\\s+"," ");
        while(!booleanValue.equalsIgnoreCase("yes") && !booleanValue.equalsIgnoreCase("no")){
            System.err.println("You must enter Yes/No value, please try again.");
            booleanValue = scanner.nextLine().trim().replaceAll("\\s+"," ");
        }
        return booleanValue.equalsIgnoreCase("yes");
    }
}
