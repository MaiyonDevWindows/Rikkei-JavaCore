package Session1.Study.Lesson7.Classroom.ra;

public class StringDemo {
    public static void main(String[] args) {
        // Khai báo chuỗi String.
        String str1 = "Rikkei Academy";
        String str2 = new String("Rikkeisoft");
        // int length: trả về độ dài chuỗi.
        System.out.println("Độ dài chuỗi str1 là: " + str1.length());
        // char charAt: trả về ký tự tại chỉ số index.
        System.out.println("Ký tự ở chỉ số 2 trong chuỗi str1: " + str1.charAt(2));
        // String concat(String str): nối chuỗi.
        System.out.println("Nối chuỗi: " + str1.concat(str2) + " - Học viện đào tạo CNTT");
        // String toUpperCase(): viết hoa chuỗi.
        System.out.println("Viết hoa chuỗi: " + str1.toUpperCase());
        // String toLowerCase(): viết thường chuỗi.
        System.out.println("Viết thường chuỗi: " + str1.toLowerCase());
        // String trim(): cắt khoảng trắng 2 đầu.
        String str3 = "   rikkei    ";
        System.out.println("Cắt khoảng trắng 2 đầu: " + str3.trim());
        // boolean equals(String str): so sánh giá trị 2 chuỗi.
        String str4 = "Rikkei Academy";
        System.out.println("So sánh str1 và str4 với equals: " + str1.equals(str4));
        // boolean equalsIgnoreCase(String str): so sánh không phân biệt hoa thường.
        // int compareTo(String str): so sánh lần lượt từng ký tự theo chỉ số bảng mã ASCII.
        // int compareIgnoreCaseTo(String str): so sánh không phân biệt hoa thường.
    }
}
