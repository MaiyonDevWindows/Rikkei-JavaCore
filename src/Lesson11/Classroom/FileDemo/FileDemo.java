package Lesson11.Classroom.FileDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDemo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 18);
        Student student2 = new Student("Sv002","Nguyễn Văn B", 20);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        writeDataToFile(listStudent);
    }
    public static void writeDataToFile(List<Student> studentList){
        // Khởi tạo file.
        File file = new File("./Lesson11/student.txt");
        // Khởi tạo đối tượng FileOutputStream.
        // Khởi tạo đối tượng ObjectOutputStream.
        // Ghi dữ liệu ra file - writeObject.
        // Đẩy dữ liệu từ Stream ra file - fflush.
        // Đóng file.
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
    }
    public static void readDataFromFile(List<Student> studentList){
        // Khởi tạo file.


        // Đọc file.

    }
}
