package seminars.first;

public class Calculator {
    public static void main(String[] args) {
        System.out.printf("Result: %s\n", calculation(2, 2, '+'));
        System.out.printf("Result: %s\n", calculation(4, 2, '-'));
        System.out.printf("Result: %s\n", calculation(8, 2, '*'));
        System.out.printf("Result: %s\n", calculation(3, 2, '/'));

        System.out.printf("Result: %s\n", calculation(8, 2, '_'));
//        System.out.printf("Result: %s\n", calculation(3,0,'/'));
        System.out.printf("Result: %s\n", calculation(1234567891, 10, '*'));
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    throw new ArithmeticException("Ошибка деления на ноль");
                }
                break;
            default:
                throw new IllegalStateException("Неизвестная операция: " + operator);
        }

        return result;
    }

    public static double squareRootExtraction(Number n) {
        if ((int) n == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return Math.sqrt((double) n);
    }
}
