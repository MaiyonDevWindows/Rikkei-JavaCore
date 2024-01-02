package Session2.Lesson7.Backend.Utils;

import java.util.Scanner;

public class InputHandles {
    public static long inputLongInteger(Scanner scanner) {
        long inputValue;
        do {
            try {
                inputValue = Long.parseLong(scanner.nextLine());
                return inputValue;
            } catch (NumberFormatException e) {
                System.err.println("Your input value is not long int, please try again.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }
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
        } while (true);
    }

    public static short inputShortInteger(Scanner scanner) {
        short inputValue;
        do {
            try {
                inputValue = Short.parseShort(scanner.nextLine());
                return inputValue;
            } catch (NumberFormatException e) {
                System.err.println("Your input value is not short int, please try again.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }while (true);
    }
}
