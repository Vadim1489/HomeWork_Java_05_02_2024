import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number1 = random.nextInt(1,10) + 1;
        int number2 = random.nextInt(1,6);
        String userName;
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation(number1,number2);
        System.out.println("Пользователь введите ваше имя: ");
        userName = scanner.nextLine();
        System.out.println("Решите задачи: " + userName);
        checkingOffTheResult(userName, arithmeticOperation.addition());
        checkingOffTheResult(userName, arithmeticOperation.substraction());
        checkingOffTheResult(userName,arithmeticOperation.division());
        checkingOffTheResult(userName, arithmeticOperation.multiply());
        System.out.println("Поздравляю! " + userName + ",опросник завершён!");
    }
    public static void  checkingOffTheResult   (String userName, double result) {
        Scanner scanner = new Scanner(System.in);
        double question = scanner.nextDouble();

        if (question == result)
            System.out.println("Поздравляю! " + userName + ",вы правильно ответили на вопрос.");
        else
            System.out.println("Увы " + userName + ",правильный ответ - " + result + ".");
    }
}