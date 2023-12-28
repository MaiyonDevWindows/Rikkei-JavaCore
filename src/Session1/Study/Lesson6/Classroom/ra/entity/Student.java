package Session1.Study.Lesson6.Classroom.ra.entity;

import java.util.Scanner;

public class Student {
    // Fields/Properties/Attributes - thuộc tính của lớp.
    // Syntax: Access Modifier (private) + dataType + fieldName.
    private String studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private float averageMark;
    // Constructors - Hàm tạo để khởi tạo đối tượng: 0 -> N.
    // Syntax: Access Modifier + ClassName (Parameters) -> parameter: datatype + paramName (0 -> N).
    // Constructor không có tham số - Default Constructor.
    public Student(){

    }
    public Student(String studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }
    public Student(String studentId, String studentName, int age, boolean gender, float averageMark){
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.averageMark = averageMark;
    }
    // Method: phương thức thể hiện hành vi của đối tượng.
    // Syntax: Access Modifier + ReturnData + MethodName (parameters).
    // Getter - Lấy thông tin thuộc tính.
    // Setter - Gán giá trị cho các thuộc tính.
    public String getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public int getAge(){
        return age;
    }
    public boolean getGender(){
        return gender;
    }
    public float getAverageMark(){
        return averageMark;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(boolean gender){
        this.gender = gender;
    }
    public void setAverageMark(float averageMark){
        this.averageMark = averageMark;
    }
    public void helloTeacher(){
        System.out.println("Hello Mr.Quang");
    }
    public void helloFriend(String friendName){
        System.out.println("Hello " + friendName);
    }
    public int addTwoNumbers(int firstNumber, int lasNumber){
        return firstNumber + lasNumber;
    }
    // Phương thức cho phép nhập thông tin đối tượng.
    public void inputData(Scanner scanner){
        System.out.print("Nhập vào mã sinh viên: ");
        this.studentId = scanner.nextLine();
        System.out.print("Nhập vào tên sinh viên: ");
        this.studentName = scanner.nextLine();
        System.out.print("Nhập vào tuổi sinh viên: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào giới tính sinh viên: ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Nhập vào điểm trung bình sinh viên: ");
        this.averageMark = Float.parseFloat(scanner.nextLine());
    }
    // Phương thức cho phép hiển thị thông tin đối tượng.
    public void  displayData(){
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %b - Điểm trung bình: %.2f\n", this.gender, this.averageMark);
    }
}
