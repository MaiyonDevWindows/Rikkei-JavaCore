package Lesson2.Exercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Menu:\n" +
                "1. Print the rectangle\n" +
                "2. Print the square triangle\n" +
                "3. Print isosceles triangle\n");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                int lengthValue, widthValue;
                System.out.print("Input rectangle length: ");
                lengthValue = scanner.nextInt();
                System.out.print("Input rectangle width: ");
                widthValue = scanner.nextInt();
                for (int i = 0; i < lengthValue; i++) {
                    for (int j = 0; j < widthValue; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            }
            case 2:{
                System.out.print("Print rectangle:\n" +
                        "1. Bottom-left.\n" +
                        "2. Top-left.\n" +
                        "3. Bottom-right.\n" +
                        "4. Top-right.\n");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:{
                        int edge;
                        System.out.print("Chiều dài cạnh tam giác: ");
                        edge = scanner.nextInt();
                        for (int i = 0; i <= edge; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                    case 2:{
                        int edge;
                        System.out.print("Chiều dài cạnh tam giác: ");
                        edge = scanner.nextInt();
                        for (int i = 0; i <= edge; i++) {
                            for (int j = 0; j < edge - i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                    case 3:{
                        int edge;
                        System.out.print("Chiều dài cạnh tam giác: ");
                        edge = scanner.nextInt();
                        for (int i = 0; i <= edge; i++) {
                            for (int j = 0; j < edge - i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = 0; j < i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                    case 4:{
                        int edge;
                        System.out.print("Chiều dài cạnh tam giác: ");
                        edge = scanner.nextInt();
                        for (int i = 0; i <= edge; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = 0; j < edge - i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    }
                }
            }
            case 3:{
                int edge;
                System.out.print("Chiều dài cạnh tam giác: ");
                edge = scanner.nextInt();
                for (int i = 0; i <= edge; i++) {
                    for (int j = 0; j < edge - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    for (int j = 0; j < i - 1; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}
