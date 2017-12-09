import java.util.List;

public class Calculator {

    public Double Summing(List<Double> list){
        Double result = 0.0;
        for (Double aDouble : list) {
            result += aDouble;
        }
     return result;
    }
}
