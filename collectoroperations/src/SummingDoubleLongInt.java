import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.summingDouble;

public class SummingDoubleLongInt {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("j", "jy", "jyo", "jyot", "jyoti");
        Double result = nameChars.stream().collect(summingDouble(String::length));
        System.out.println("Sum of length of extracted elements : " + result);
    }
}
