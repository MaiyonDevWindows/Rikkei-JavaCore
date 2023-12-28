package Session2.Project;

import Session2.Project.Presentation.IManagement;
import Session2.Project.PresentationImp.WarehouseManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IManagement warehouseManagement = new WarehouseManagement();
        warehouseManagement.displayMenu(scanner);
    }
}