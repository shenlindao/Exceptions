package Homework.Homework_02;

public class Ex_02 {
    public static void main(String[] args) {
        catchedRes1();
    }

    public static void catchedRes1() {
        // Если массив меньше размером, будет поймана ошибка IndexOutOfBoundsException
        // int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        try {
            // При делении на ноль будет поймана ошибка ArithmeticException
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
