package Lesson9.BonusExercises.ra.business;

import java.util.Scanner;

public interface IEmployee {
    public static final int BASIC_SALARY = 1300000;

    public String inputEmployeeId(Scanner scanner);

    public void updateEmployee(Scanner scanner);

    public void inputData(Scanner scanner);

    public void displayData();
}
