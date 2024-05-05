import java.math.BigDecimal;
import java.util.List;

public class Adder {

    public int add(int a, int b) {
        return a + b;
    }
    public BigDecimal add(List<BigDecimal> numbers) {
        BigDecimal result = BigDecimal.ZERO;
        for (BigDecimal num : numbers) {
            result = result.add(num);
        }
        return result;
    }
}
