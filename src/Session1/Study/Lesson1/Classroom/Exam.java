package Session1.Study.Lesson1.Classroom;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        /* Nhập thông tin sách gồm các thông tin sau:
        1. Mã sách - String.
        2. Tên sách - String.
        3. Giá sách - double.
        4. Tác giá - String.
        5. Nhà xuất bản - String.
        6. Trạng thái sách - Boolean.
        In thông tin sách theo định dạng sau: - printf
        Mã sách: S001 - Tên sách: Văn học - Tác giả: Nguyễn Văn A
        Giá sách: 78000 - Nhà xuất bản: Kim Đồng - Trạng thái sách: true
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào mã sách: ");
        String bookId = scanner.nextLine();
        System.out.print("Nhập vào tên sách: ");
        String bookName = scanner.nextLine();
        System.out.print("Nhập vào giá sách: ");
        double bookCost = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập vào tên tác giá: ");
        String bookAuthor = scanner.nextLine();
        System.out.print("Nhập vào nhà xuất bản: ");
        String publishingCompany = scanner.nextLine();
        System.out.print("Nhập vào trạng thái sách (true/false): ");
        Boolean bookStatus = Boolean.parseBoolean(scanner.nextLine());

        System.out.printf("Mã sách: %s - Tên sách: %s - Tác giả: %s\n" +
                "Giá sách: %f - Nhà xuất bản: %s - Trạng thái sách: %b", bookId, bookName, bookAuthor, bookCost,
                publishingCompany, bookStatus);
    }
}
