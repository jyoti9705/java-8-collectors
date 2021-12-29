import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.averagingDouble;

public class AveragingDoubleLongIntExample {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("j", "jy", "jyo", "jyot", "jyoti");

        //Double
        Double averageLengthDouble = nameChars.stream().collect(averagingDouble(String::length));
        System.out.println("Average length using averaging Double : " + averageLengthDouble);

    }
}
