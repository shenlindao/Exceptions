package Homework.Homework_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getNumber(scanner);
    }

    public static void getNumber(Scanner scanner) {
        System.out.println("Пожалуйста, введите дробное число");
        try {
            float number = scanner.nextFloat();
            if (number % 1 != 0) {
                System.out.printf("Вы ввели дробное число число %f", number);
            } else {
                System.out.println("Ошибка! Требуется ввести дробное число!");
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Ошибка! Требуется ввести дробное число!");
        }
        scanner.close();
    }
}
