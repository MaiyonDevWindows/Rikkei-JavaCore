package Session1.Study.Lesson11.BonusExercises.ExceptionFileEx.business.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class inputMethods {
    public static int inputInteger(Scanner scanner){
        int integer;
        do{
            try{
                integer = Integer.parseInt(scanner.nextLine());
                return integer;
            }catch (NumberFormatException ex){
                System.err.println("The value you entered could not be converted to int, please try again.");
            } catch (Exception ex){
                System.err.println(ex.getMessage());
            }
        }while (true);
    }
    public static float inputFloat(Scanner scanner){
        float floatInput;
        do{
            try{
                floatInput = Float.parseFloat(scanner.nextLine());
                return floatInput;
            }catch (NumberFormatException ex){
                System.err.println("The value you entered could not be converted to float, please try again.");
            }catch (Exception ex){
                System.err.println(ex.getMessage());
            }
        }while(true);
    }
    public static Date inputDate(Scanner scanner){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        do {
            try {
                return simpleDateFormat.parse(scanner.nextLine());
            } catch (ParseException Ex) {
                System.err.println("Date time format is dd/MM/yyyy, please try again");
            } catch (Exception ex){
                System.err.println(ex.getMessage());
            }
        } while (true);
    }
}
