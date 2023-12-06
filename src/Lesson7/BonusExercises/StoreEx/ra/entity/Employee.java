package Lesson7.BonusExercises.StoreEx.ra.entity;

public class Employee {
    private int empId;
    private String empName;
    private String birthYear;
    private String phone;
    private String email;
    private int empStatus;

    public Employee() {
    }

    public Employee(int empId, String empName, String birthYear, String phone, String email, int empStatus) {
        this.empId = empId;
        this.empName = empName;
        this.birthYear = birthYear;
        this.phone = phone;
        this.email = email;
        this.empStatus = empStatus;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(int empStatus) {
        this.empStatus = empStatus;
    }
    public void inputData(){
        System.out.println("input data");
    }
    public void displayData(){
        System.out.println("display data");
    }
}
