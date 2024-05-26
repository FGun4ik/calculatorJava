import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double firstNumber = scan.nextDouble();
        System.out.println("Введите второе число: ");
        double secondNumber = scan.nextDouble();
        System.out.println("Введите операцию (+, -, *, /, %, ^): ");
        char operation = scan.next().charAt(0);
        if (operation == '+') {
            System.out.println("Результат сложения: " + (firstNumber + secondNumber));
        } else if (operation == '-') {
            System.out.println("Результат вычитания: " + (firstNumber - secondNumber));
        } else if (operation == '*') {
            System.out.println("Результат умножения: " + (firstNumber * secondNumber));
        } else if (operation == '/') {
            if (secondNumber != 0) {
                System.out.println("Результат деления: " + (firstNumber / secondNumber));
            } else {
                System.out.println("Ошибка: Деление на ноль невозможно");
            }
        } else if (operation == '%') {
            System.out.println("Результат остатка от деления: " + (firstNumber % secondNumber));
        } else if (operation == '^') {
            System.out.println("Результат возведения в степень: " + Math.pow(firstNumber, secondNumber));
        } else {
            System.out.println("Неверная операция");
        }
    }
}
