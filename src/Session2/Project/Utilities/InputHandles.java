package Session2.Project.Utilities;

import java.util.Scanner;

public class InputHandles {
    public static int inputInteger(Scanner scanner){
        int input;
        do {
            try{
                input = Integer.parseInt(scanner.nextLine());
                return input;
            }catch (NumberFormatException e){
                System.err.println("Your input value is not integer number.");
            }catch (Exception e){
                System.err.println("Undefined error.");
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
                System.err.println("Your input value is not float number.");
            }catch (Exception e){
                System.err.println("Undefined error.");
            }
        }while (true);
    }
    public static String inputTrimString (Scanner scanner){
        String input;
        input = scanner.nextLine();
        return input;
    }
}
