public class ArithmeticOperation {
    double number1;
    double number2;
    public  ArithmeticOperation (double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;

    }

    public  double addition () {
        System.out.println("Задача №1:");
        System.out.print(number1 + " + " + number2 + " = ");
        return number1 + number2;
    }
    public double substraction () {
        System.out.println("Задача №2:");
        System.out.print(number1 + " - " + number2 + " = ");
        return number1 - number2;
    }
    public double division () {
        System.out.println("Задача №3:");
        System.out.print(number1 + " / " + number2 + " = ");
        return number1 / number2;
    }
    public double multiply () {
        System.out.println("Задача №4:");
        System.out.print(number1 + " * " + number2 + " = ");
        return number1 * number2;
    }
}
