import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {
        // создаем экземпляр класса Calculator
        Calculator myCalculator = new Calculator();
        System.out.println("Если Вы хотите выполнить сложение любого числа чисел, введите: +, если вычитание: -, умножение: *, деление: /");
        // считываем строку из консоли
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        //проверяем, что за символ ввел пользователь
        if(operation.equals("+")){
            System.out.println("Введите числа, которые хотите просуммировать, через знак , ");
            // считываем строку из консоли
            String inputstring = scanner.nextLine();
            // выделяем из строки подстроки, разделенные запятой
            String[] stringArray = inputstring.split(",");
            List<Double> doubleList = new ArrayList<Double>();
            // преобразуем строки в Double и складываем их в List, который отправим в метод калькулятора
            for (String s : stringArray) {
                doubleList.add(Double.parseDouble(s));
            }
            // вызываем метод сложения
            Double result = myCalculator.Summing(doubleList);
            // выводим результат в консоль
            System.out.println("Результат сложения: ");
            System.out.print(String.format("%(.4f", result));
        }
        if(operation.equals("-")){
            System.out.println("Введите первое число:");
            // считываем строку из консоли
            String a = scanner.nextLine();
            Double doubleA = Double.parseDouble(a);
            System.out.println("Введите второе число:");
            // считываем строку из консоли
            String b = scanner.nextLine();
            Double doubleB = Double.parseDouble(b);
            // вызываем метод вычитания
            Double result = myCalculator.Subtraction(doubleA, doubleB);
            // выводим результат в консоль
            System.out.println("Результат вычитания: ");
            System.out.print(String.format("%(.4f", result));
        }
        if(operation.equals("*")){
            System.out.println("Введите числа, которые хотите перемножить, через знак , ");
            // считываем строку из консоли
            String inputstring = scanner.nextLine();
            // выделяем из строки подстроки, разделенные запятой
            String[] stringArray = inputstring.split(",");
            List<Double> doubleList = new ArrayList<Double>();
            // преобразуем строки в Double и складываем их в List, который отправим в метод калькулятора
            for (String s : stringArray) {
                doubleList.add(Double.parseDouble(s));
            }
            // вызываем метод умножения
            Double result = myCalculator.Multiplication(doubleList);
            // выводим результат в консоль
            System.out.println("Результат сложения: ");
            System.out.print(String.format("%(.4f", result));
        }
        if(operation.equals("/")){
            System.out.println("Введите первое число:");
            // считываем строку из консоли
            String a = scanner.nextLine();
            Double doubleA = Double.parseDouble(a);
            System.out.println("Введите второе число:");
            // считываем строку из консоли
            String b = scanner.nextLine();
            Double doubleB = Double.parseDouble(b);
            // вызываем метод деления
            Double result = myCalculator.Division(doubleA, doubleB);
            // выводим результат в консоль
            System.out.println("Результат деления: ");
            System.out.print(String.format("%(.4f", result));
        }
    }
}
