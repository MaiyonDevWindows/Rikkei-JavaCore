package Session1.Study.Lesson6.Classroom.ra;

import Session1.Study.Lesson6.Classroom.ra.entity.Book;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        /*  2. Xây dựng lớp BookManagement trong package ra.run thực hiện:
        - Khai báo mảng gồm 100 sách
        - Hiển thị menu và thực hiện các chức năng theo menu:
        **MENU**
        1. Nhập số lượng sách (n) và nhập thông tin n sách (lưu vào mảng).
        2. Hiển thị tất cả sách đang quản lý.
        3. Tính giá xuất của các sách đang quản lý.
        4. Sắp xếp sách theo giá nhập tăng dần.
        5. Tìm kiếm sách theo tên sách.
        6. Thoát.
     */
        Scanner scanner = new Scanner(System.in);
        Book[] bookArray = new Book[100];
        int choice = 0, n = 0;
        while (true) {
            System.out.println("**MENU**\n" +
                    "1. Nhập số lượng sách (n) và nhập thông tin n sách (lưu vào mảng).\n" +
                    "2. Hiển thị tất cả sách đang quản lý.\n" +
                    "3. Tính giá xuất của các sách đang quản lý.\n" +
                    "4. Sắp xếp sách theo giá nhập tăng dần.\n" +
                    "5. Tìm kiếm sách theo tên sách.\n" +
                    "6. Thoát.\n" +
                    "Lựa chọn của bạn là: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    System.out.print("Please enter book quantity (n): ");
                    n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Please inputMethods date for book " + i);
                        bookArray[i].inputData(scanner);
                    }
                }
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Please enter correct choice value (1 - 6).");
            }
        }
    }

}
