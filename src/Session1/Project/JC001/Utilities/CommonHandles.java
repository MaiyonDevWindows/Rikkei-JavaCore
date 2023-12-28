package Session1.Project.JC001.Utilities;

import java.util.Scanner;

public class CommonHandles {
    public static int choiceInteger(Scanner scanner){
        System.out.print("Please enter your choice: ");
        return InputHandles.inputInteger(scanner);
    }
}
