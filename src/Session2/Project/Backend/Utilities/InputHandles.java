package Session2.Project.Backend.Utilities;

import java.util.Scanner;

public class InputHandles {
    public static long inputLongInteger(Scanner scanner) {
        long input;
        do {
            try {
                input = Long.parseLong(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Your input value is not long int, please try again.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }
    public static int inputInteger(Scanner scanner){
        int input;
        do {
            try{
                input = Integer.parseInt(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Your input value is not int, please try again.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public static short inputShortInteger(Scanner scanner) {
        short input;
        do {
            try {
                input = Short.parseShort(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Your input value is not short int, please try again.");
            }catch (Exception e){
                e.printStackTrace();
            }
        }while (true);
    }
    public static float inputFloat(Scanner scanner){
        float input;
        do {
            try{
                input = Float.parseFloat(scanner.nextLine());
                return input;
            }catch (NumberFormatException e){
                System.err.println("Your input value is not float, please try again.");
            }catch (Exception e){
                System.err.println("Undefined error.");
            }
        } while (true);
    }

    public static double inputDouble(Scanner scanner) {
        double input;
        do {
            try {
                input = Double.parseDouble(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Your input value is not double, please try again.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }while (true);
    }
    public static String inputTrimString (Scanner scanner){
        String input = scanner.nextLine().trim();
        while (input.isEmpty()) {
            System.err.println("Your input string must not be empty, please try again.");
            input = scanner.nextLine().trim();
        }
        return input;
    }

    public static String inputNormalizeString(Scanner scanner) {
        String input = scanner.nextLine().trim().replaceAll("\\s+", " ");
        while (input.isEmpty()) {
            System.err.println("Your input string must not be empty, please try again.");
            input = scanner.nextLine().trim().replaceAll("\\s+", " ");
        }
        return input;
    }

    public static boolean inputBoolean(Scanner scanner) {
        String booleanValue = scanner.nextLine().trim().replaceAll("\\s+", " ");
        while (!booleanValue.equalsIgnoreCase("true") && !booleanValue.equalsIgnoreCase("false")) {
            System.err.println("You must enter boolean value true/false, please try again.");
            booleanValue = scanner.nextLine().trim().replaceAll("\\s+", " ");
        }
        return Boolean.parseBoolean(booleanValue);
    }

    public static boolean inputConfirmValue(Scanner scanner) {
        String booleanValue = scanner.nextLine().trim().replaceAll("\\s+", " ");
        while (!booleanValue.equalsIgnoreCase("yes") && !booleanValue.equalsIgnoreCase("no")) {
            System.err.println("You must enter Yes/No value, please try again.");
            booleanValue = scanner.nextLine().trim().replaceAll("\\s+", " ");
        }
        return booleanValue.equalsIgnoreCase("yes");
    }
}
