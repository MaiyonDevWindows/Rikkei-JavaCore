package Session1.Project.JC002;

import Session1.Project.JC002.PresentationImp.StoreManagementImp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StoreManagementImp storeManagement = new StoreManagementImp();
        storeManagement.displayMenu(scanner);
    }
}
