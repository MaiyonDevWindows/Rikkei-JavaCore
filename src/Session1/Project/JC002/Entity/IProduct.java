package Session1.Project.JC002.Entity;

import java.util.Scanner;

public interface IProduct {
    float MIN_INTEREST_RATE = 0.2f;
    public void inputData(Scanner scanner);
    public void displayData();
    public void calProfit();
}
