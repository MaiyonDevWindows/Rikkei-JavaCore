package Session2.Lesson7.Backend.Presentation;

import Session2.Lesson7.Backend.Utils.CommonHandles;

import java.util.Scanner;

public class CategoryManagement implements IManagement{
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do{
            System.out.println("*************CATEGORIES MANAGEMENT**********\n" +
                    "1. Danh sách danh mục\n" +
                    "2. Thêm mới danh mục\n" +
                    "3. Cập nhật danh mục\n" +
                    "4. Xóa danh mục (Chỉ được xóa danh mục chưa có sản phẩm)\n" +
                    "5. Tìm danh mục theo tên\n" +
                    "6. Back.");
            choice = CommonHandles.enterChoice(scanner);
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while (!isExit);
    }
}
