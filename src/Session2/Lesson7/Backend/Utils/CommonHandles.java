package Session2.Lesson7.Backend.Utils;

import java.util.Scanner;

public class CommonHandles {
    public static int enterChoice(Scanner scanner){
        System.out.print("Please enter your choice: ");
        return InputHandles.inputInteger(scanner);
    }
}
