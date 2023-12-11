package Lesson11.BonusExercises.ExceptionFileEx.presentation;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManagement bookManagement = new BookManagement();
        bookManagement.displayMenu(scanner);
    }
}
