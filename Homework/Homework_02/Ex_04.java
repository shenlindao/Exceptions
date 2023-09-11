package Homework.Homework_02;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getString(scanner);
    }

    public static void getString(Scanner scanner) {
        System.out.print("Введите строку: \n");
        String string = scanner.nextLine();
        try {
            if (string.equals("")) {
                throw new RuntimeException("\nСтрока не должна быть пустой!\n");
            } else {
                System.out.println("Вы ввели: " + string);
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
