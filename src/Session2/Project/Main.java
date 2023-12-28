package Session2.Project;

import Session2.Project.PresentationImp.WarehouseManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WarehouseManagement warehouseManagement = new WarehouseManagement();
        warehouseManagement.displayAdminMenu(scanner);
    }
}