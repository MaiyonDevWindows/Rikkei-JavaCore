package Session2.Lesson7.Presentation;

import Session2.Lesson7.Utils.CommonHandles;

import java.util.Scanner;

public class ProductManagement implements IManagement{
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.println("**************PRODUCT MANAGEMENT************\n" +
                    "1. Danh sách sản phẩm\n" +
                    "2. Thêm mới sản phẩm\n" +
                    "3. Cập nhật sản phẩm\n" +
                    "4. Xóa sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Hiển thị các sản phẩm theo mã danh mục\n" +
                    "7. Thống kê số lượng sản phẩm của từng danh mục\n" +
                    "8. Sắp xếp sản phẩm theo giá tăng dần\n" +
                    "9. Back.");
            choice = CommonHandles.enterChoice(scanner);
            switch(choice){
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
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while (!isExit);
    }
}
