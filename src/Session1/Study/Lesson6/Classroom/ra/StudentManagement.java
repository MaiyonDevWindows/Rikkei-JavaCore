package Session1.Study.Lesson6.Classroom.ra;

import Session1.Study.Lesson6.Classroom.ra.entity.Student;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        Student student2 = new Student("SV002", "Nguyễn Văn B");
        Student student3 = new
                Student("SV003", "Nguyễn Văn C", 25, true, 8.7f);
        System.out.println("Thông tin đối tượng sinh viên 1: ");
        student1.displayData();;
        System.out.println("Thông tin đối tượng sinh viên 2: ");
        student2.displayData();
        System.out.println("Thông tin đối tượng sinh viên 3: ");
        student3.displayData();

        System.out.print("Nhập vào tuổi của sinh viên 2: ");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập vào giới tính sinh viên 2: ");
        student2.setGender(Boolean.parseBoolean(scanner.nextLine()));
        System.out.print("Nhập vào điểm trung bình sinh viên 2: ");
        student2.setAverageMark(Float.parseFloat(scanner.nextLine()));
        System.out.println("Thông tin đối tượng sinh viên 2: ");
        student2.displayData();;

        System.out.println("Tên của sinh viên 3 là: " + student3.getStudentName());
    }
}
