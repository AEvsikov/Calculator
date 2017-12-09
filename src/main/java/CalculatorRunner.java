import java.nio.DoubleBuffer;
import java.util.ArrayList;
        import java.util.List;
import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {
        // создаем экземпляр класса Calculator
        Calculator myCalculator = new Calculator();
        System.out.println("Введите числа, которые хотите просуммировать, через знак , ");
        // считываем строку из консоли
        Scanner scanner = new Scanner(System.in);
        String inputstring = scanner.nextLine();
        // выделяем из строки подстроки, разделенные запятой
        String[] stringList = inputstring.split(",");
        List<Double> doubleList = new ArrayList<Double>();
        // преобразуем строки в Double и складываем их в List, который отправим в метод калькулятора
        for (String s : stringList) {
            doubleList.add(Double.parseDouble(s));
        }
        // вызываем метод сложения
        Double a = myCalculator.Summing(doubleList);
        // выводим результат в консоль
        System.out.println("Результат сложения: ");
        System.out.print(String.format("%(.4f", a));
    }
}
