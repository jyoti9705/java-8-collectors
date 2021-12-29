import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.*;

public class TeeingExample {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("j", "jy", "jyo", "jyot", "rit", "rites", "jyoti");
        List<String> output = nameChars.stream().collect(teeing(minBy(Comparator.comparing(String::length)), maxBy(Comparator.comparing(String::length)),
                (max, min) -> {
                    List<String> maxAndMinString = new ArrayList<>();
                    maxAndMinString.add(max.get());
                    maxAndMinString.add(min.get());
                    return maxAndMinString;
                }));

        System.out.println("Output after teeing : " + output.toString());
    }
}
