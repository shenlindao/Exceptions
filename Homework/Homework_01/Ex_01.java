public class Ex_01 {
    public static class Answer {
        public static void arrayOutOfBoundsException() {
            try {
                int[] array = { 400, 12, 56, 679, 1 };
                System.out.println(array[7]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка! Вы вышли за пределы массива!");
            }
        }

        public static void divisionByZero() {
            try {
                int a = 10;
                int b = 0;
                int c = a / b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка! По законам математики на ноль делить нельзя!");
            }

        }

        public static void numberFormatException() {
            try {
                String string = "string";
                int number = Integer.parseInt(string);
                System.out.println(number);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Невозможно преобразовать в число строку, содержащую в себе символы, отличные от цифр!");
            }

        }
    }

    public class Printer {
        public static void main(String[] args) {
            Answer ans = new Answer();
            try {
                ans.arrayOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
            }

            try {
                ans.divisionByZero();
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }

            try {
                ans.numberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования строки в число");
            }
        }
    }
}
