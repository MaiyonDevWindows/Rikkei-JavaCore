package Session2.Lesson7.Backend.Utils;

import java.util.Scanner;

public class InputHandles {
    public static int inputInteger(Scanner scanner){
        int inputValue;
        do {
            try{
                inputValue = Integer.parseInt(scanner.nextLine());
                return inputValue;
            }catch(NumberFormatException e){
                System.err.println("Your input value is not int, please try again.");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }while (true);
    }
}
