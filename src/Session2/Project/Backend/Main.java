package Session2.Project.Backend;

import Session2.Project.Backend.PresentationImp.WarehouseManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WarehouseManagement warehouseManagement = new WarehouseManagement();
        warehouseManagement.displayAdminMenu(scanner);
        System.out.println("something");
        System.out.println("End program.");
        System.exit(0);
    }
}