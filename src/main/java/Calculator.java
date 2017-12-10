import java.util.List;

public class Calculator {

    public Double Summing(List<Double> list){
        Double result = 0.0;
        for (Double aDouble : list) {
            result += aDouble;
        }
     return result;
    }

    public Double Subtraction(Double a, Double b) {
        return a - b;
    }

    public Double Multiplication(List<Double> list){
        Double result = 0.0;
        for (Double aDouble : list) {
            result *= aDouble;
        }
        return result;
    }

    public Double Division(Double a, Double b){
        return a / b;
    }
}
