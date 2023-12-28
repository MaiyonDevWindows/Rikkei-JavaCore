package Session1.Study.Lesson11.BonusExercises.ExceptionFileEx.business.entityImp;

import java.util.Date;
import java.util.Scanner;

public interface IBook {
    public int generateBookId();
    public String inputBookName(Scanner scanner);
    public boolean validateBookName(String bookName);
    public boolean isExistBookName(String bookName);
    public float inputImportPrice(Scanner scanner);
    public boolean validateImportPrice(float importPrice);
    public float inputExportPrice(Scanner scanner);
    public boolean validateExportPrice(float exportPrice);
    public String inputAuthor(Scanner scanner);
    public boolean validateAuthorName(String authorName);
    public Date inputCreatedDate(Scanner scanner);
    public String inputDescriptions(Scanner scanner);
    public boolean validateDescriptions(String descriptions);
    public void inputData(Scanner scanner);
    public void updateDataByBookId(Scanner scanner, int bookId);
    public void displayData();
}
