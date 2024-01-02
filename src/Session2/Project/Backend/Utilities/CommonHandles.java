package Session2.Project.Backend.Utilities;

import java.util.Scanner;

public class CommonHandles {
    public static int inputChoice(Scanner scanner){
        System.out.print("Please enter your choice: ");
        return InputHandles.inputInteger(scanner);
    }
}
