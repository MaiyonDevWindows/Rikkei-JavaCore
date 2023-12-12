package JC001;

import JC001.presentationImp.LibraryManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManagement libraryManagement = new LibraryManagement();
        libraryManagement.displayMenu(scanner);
    }
}
