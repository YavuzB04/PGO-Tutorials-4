import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        System.out.println("Result: " + multiplier.multiply(3, 4));
        System.out.println("Result BigDecimal: " + multiplier.multiply(BigDecimal.valueOf(3.5), BigDecimal.valueOf(4.5)));

        Adder adder = new Adder();
        System.out.println("Result: " + adder.add(3, 4));
        System.out.println("ResultBigDecimal: " + adder.add(Arrays.asList(BigDecimal.valueOf(3.5), BigDecimal.valueOf(4.5))));

        Address address = new Address();
        System.out.println("Address: " + address.createAddress("Country", "City", "12345", "Street", 10));
    }
}
