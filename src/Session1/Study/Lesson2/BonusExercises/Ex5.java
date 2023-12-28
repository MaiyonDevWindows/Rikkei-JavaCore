package Session1.Study.Lesson2.BonusExercises;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 3 cạnh của tam giác: ");
        float edge1, edge2, edge3;
        edge1 = scanner.nextFloat();
        edge2 = scanner.nextFloat();
        edge3 = scanner.nextFloat();
        String msg;
        if(edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1){
            System.out.println("Đây là ba cạnh của 1 tam giác!");
            if((edge1 * edge1 == edge2 * edge2 + edge3 * edge3) && (edge2 == edge3) ||
                    (edge2 * edge2 == edge1 * edge1 + edge3 * edge3) && (edge1 == edge3) ||
                    (edge3 * edge3 == edge1 * edge1 + edge2 * edge2) && (edge1 == edge2))
                msg = "Đây là tam giác vuông cân!";
            else if(edge1 * edge1 == edge2 * edge2 + edge3 * edge3 ||
                    edge2 * edge2 == edge1 * edge1 + edge3 * edge3 ||
                    edge3 * edge3 == edge1 * edge1 + edge2 * edge2)
                msg = "Đây là tam giác vuông!";
            else if(edge1 == edge2 && edge2 == edge3) msg = "Đây là tam giác đều!";
            else if(edge1 == edge2 || edge2 == edge3 || edge1 == edge3) msg = "Đây là tam giác cân!";
            else msg = "Đây là tam giác thường!";
            System.out.println(msg);
        }else System.out.println("Đây không phải là ba cạnh của 1 tam giác!");
    }
}