package Session1.Study.Lesson2.Exercises;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----- Menu -----");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn (1-4): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:{
                        System.out.print("Nhập chiều dài hình chữ nhật: ");
                        double chieuDai = scanner.nextDouble();
                        System.out.print("Nhập chiều rộng hình chữ nhật: ");
                        double chieuRong = scanner.nextDouble();
                        double chuVi = 2 * (chieuDai + chieuRong);
                        double dienTich = chieuDai * chieuRong;
                        System.out.println("Chu vi hình chữ nhật là: " + chuVi);
                        System.out.println("Diện tích hình chữ nhật là: " + dienTich);
                        break;
                    }
                    case 2:{
                        System.out.print("Nhập chiều dài cạnh a của tam giác: ");
                        double a = scanner.nextDouble();
                        System.out.print("Nhập chiều dài cạnh b của tam giác: ");
                        double b = scanner.nextDouble();
                        System.out.print("Nhập chiều dài cạnh c của tam giác: ");
                        double c = scanner.nextDouble();
                        double chuVi = a + b + c;
                        double p = chuVi / 2;
                        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                        System.out.println("Chu vi tam giác là: " + chuVi);
                        System.out.println("Diện tích tam giác là: " + dienTich);
                        break;
                    }
                    case 3: {
                        System.out.print("Nhập bán kính hình tròn: ");
                        double banKinh = scanner.nextDouble();
                        final double PI = 3.14;
                        double chuVi = 2 * PI * banKinh;
                        double dienTich = PI * Math.pow(banKinh, 2);
                        System.out.println("Chu vi hình tròn là: " + chuVi);
                        System.out.println("Diện tích hình tròn là: " + dienTich);
                    }
                    case 4:
                        System.out.println("Chương trình kết thúc.");
                        System.exit(0);
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            } else {
                System.out.println("Vui lòng nhập số nguyên. Thử lại.");
                scanner.next();
            }
        }
    }
}
