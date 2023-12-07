package Lesson10.Classroom.ArrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Khởi tạo đối tượng ArrayList.
        List<Student> list1 = new ArrayList<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 18);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 20);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 25);
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        Student student4 = new Student("SV004", "Nguyễn Văn D", 22);
        Student student5 = new Student("SV005", "Nguyễn Văn E", 19);
        List<Student> list2 = new ArrayList<>();
        list2.add(student4);
        list2.add(student5);
    }
}
