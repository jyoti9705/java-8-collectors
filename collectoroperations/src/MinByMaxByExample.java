import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class MinByMaxByExample {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("j", "jy", "jyo", "jyot", "jyoti");

        //maxBy
        Optional<String> max = nameChars.stream().collect(maxBy(Comparator.comparing(String::length)));
        String maxString = max.isPresent() ? max.get() : "";
        System.out.println("Max Length String : " + maxString);

        //minBy
        Optional<String> min = nameChars.stream().collect(minBy(Comparator.comparing(String::length)));
        String minString = min.isPresent() ? min.get() : "";
        System.out.println("Min Length String : " + minString);


    }
}
