package Session1.Study.Lesson3.BonusExercises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choiceValue = 0;
        while(choiceValue != 7) {
            System.out.println("******************************Breakfast Menu*************************\n" +
                    "1. Phở tôm hùm\n" +
                    "2. Phở bò Kobe\n" +
                    "3. Phở gà Việt Nam\n" +
                    "4. Xôi trứng thịt\n" +
                    "5. Bánh mỳ trứng\n" +
                    "6. Mỳ tôm không người lái\n" +
                    "7. Thoát");
            choiceValue = scanner.nextInt();
            switch (choiceValue){
                case 1:{
                    System.out.println("Bạn vừa chọn phở tôm hùm, vui lòng đợi trong giây lát!");
                    break;
                }
                case 2:{
                    System.out.println("Bạn vừa chọn phở bò Kobe, vui lòng đợi trong giây lát!");
                    break;
                }
                case 3:{
                    System.out.println("Bạn vừa chọn phở gà Việt Nam, vui lòng đợi trong giây lát!");
                    break;
                }
                case 4:{
                    System.out.println("Bạn vừa chọn xôi trứng thịt, vui lòng đợi trong giây lát!");
                    break;
                }
                case 5:{
                    System.out.println("Bạn vừa chọn bánh mỳ trứng, vui lòng đợi trong giây lát!");
                    break;
                }
                case 6:{
                    System.out.println("Bạn vừa chọn mỳ tôm không người lái, vui lòng đợi trong giây lát!");
                    break;
                }
                case 7:
                    break;
                default: {
                    System.out.println("Vui lòng chọn từ (1 - 7)!");
                    break;
                }
            }
        }
    }
}
