package Session1.Project.JC001;

import Session1.Project.JC001.PresentationImp.LibraryManagementImp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManagementImp libraryManagementImp = new LibraryManagementImp();
        libraryManagementImp.displayMenu(scanner);
    }
}
