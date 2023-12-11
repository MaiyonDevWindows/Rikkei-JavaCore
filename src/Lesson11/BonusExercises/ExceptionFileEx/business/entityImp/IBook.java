package Lesson11.BonusExercises.ExceptionFileEx.business.entityImp;

import java.util.Date;
import java.util.Scanner;

public interface IBook {
    public int generateBookId(Scanner scanner);
    public String inputBookName(Scanner scanner);
    public boolean validateBookName(String bookName);
    public boolean isExistBookName(String bookName);
    public float inputImportPrice(Scanner scanner);
    public float inputExportPrice(Scanner scanner);
    public String inputAuthor(Scanner scanner);
    public Date inputCreatedDay(Scanner scanner);
    public String inputDescriptions(Scanner scanner);
    public void inputData(Scanner scanner);
    public void displayData();
}
