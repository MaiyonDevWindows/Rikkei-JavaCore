package input_output;

public class OutputDemo {
    public static void main(String[] args) {
        // In ra chuỗi Rikkei Academy, in xong không xuống dòng.
        System.out.print("Rikkei Academy ");
        // In ra chuỗi xin chào các bạn lớp IT-Fresher, in xong xuống dòng.
        System.out.println("Xin chào các bạn lớp IT-Fresher");
        // Khai báo và khởi tạo giá trị biến tên sinh viên và tuổi sinh viên, sau đó in ra.
        // System.out.printf("Control string", value1, value2, ...)
        // value1, value2, ... trong chuỗi điều khiển có nhiều định dạng thì phải truyền vào tương ứng từng đó giá trị.
        String studentName = "Nguyễn Văn A";
        int age = 20;
        System.out.printf("Tên sinh viên: %s, tuổi: %d\n", studentName, age);
    }
}
