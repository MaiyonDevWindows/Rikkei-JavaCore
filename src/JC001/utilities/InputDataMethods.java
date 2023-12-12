package JC001.utilities;

import java.util.Scanner;

public class InputDataMethods {
    public static int inputInteger(Scanner scanner){
        int inputInt;
        System.out.print("Please enter integer value: ");
        do{
            try {
                inputInt = Integer.parseInt(scanner.nextLine());
                return inputInt;
            }catch (NumberFormatException ex){
                System.err.println(ex.getMessage());
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }while (true);
    }
    public static String inputString(Scanner scanner){
        String inputString;
        System.out.print("Please enter string value: ");
        do{
            try{
                inputString = scanner.nextLine();
                return inputString;
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }while (true);
    }
    public static float inputFloat(Scanner scanner){
        float inputFloat;
        System.out.print("Please enter float value: ");
        do{
            try{
                inputFloat = Float.parseFloat(scanner.nextLine());
                return inputFloat;
            }catch (NumberFormatException ex){
                System.err.println(ex.getMessage());
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }while (true);
    }
}
