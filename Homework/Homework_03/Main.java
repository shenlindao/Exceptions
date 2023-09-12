package Homework.Homework_03;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        wrightData();
    }

    public static void wrightData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию, имя, отчество, дату рождения (в формате dd.mm.yyyy), номер телефона " +
                "(число без разделителей) и пол(символ латиницей f или m), разделенные пробелом\nПример заполнения: Ivanov Ivan Ivanovich 01.01.1980 89012223344 m\n");
        String input = scanner.nextLine();
        String[] data = getData(input);
        checkFormats(data);
        writeFile(data);
        scanner.close();
    }

    public static String[] getData(String input) {
        String[] result = input.split(" ");
        if (result.length < 6) {
            throw new RuntimeException("Введены не все данные!");
        } else if (result.length > 6) {
            throw new RuntimeException("Введены лишние данные!");
        }
        return result;
    }

    public static void checkFormats(String[] data) {

        if (data[0].matches(".*\\d.*")) {
            throw new RuntimeException("Фамилия не может содержать цифры!");
        }
        if (data[1].matches(".*\\d.*")) {
            throw new RuntimeException("Имя не может содержать цифры!");
        }
        if (data[2].matches(".*\\d.*")) {
            throw new RuntimeException("Отчество не может содержать цифры!");
        }
        if (data[3].length() != 10 || !data[3].contains(".")
                || data[3].matches("[a-zA-Zа-яА-Я]*$")) {
            throw new RuntimeException("Неверный формат даты!");
        }
        if (data[4].length() != 11 || data[4].matches(".*\\D.*")) {
            throw new RuntimeException("Неверный формат телефона!");
        }
        if (!data[5].equals("m") && !data[5].equals("f")) {
            throw new RuntimeException("Неверно указан пол!");
        }
    }

    public static void writeFile(String[] data) {
        String fileName = data[0].toLowerCase() + ".txt";
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            if (file.length() > 0) {
                fileWriter.write('\n');
            }
            fileWriter.write(String.format("%s %s %s %s %s %s", data[0], data[1],
                    data[2], data[3], data[4], data[5]));
        } catch (IOException e) {
            throw new RuntimeException("Возникла ошибка при работе с файлом");
        }
    }
}