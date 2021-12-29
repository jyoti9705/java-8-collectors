import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toUnmodifiableMap;

public class ToMapImplementation {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("j", "jy", "jyo", "jyot", "jyoti", "jy");
        //toMap
        Map<String, Integer> map = nameChars.stream().collect(toMap(Function.identity(), String::length, (i1, i2) -> i1));
        System.out.println(map);
        //toUnModifiableMap
        Map<String, Integer> toUnModifiableMap = nameChars.stream().collect(toUnmodifiableMap(Function.identity(), String::length, (i1, i2) -> i1));
        System.out.println(toUnModifiableMap);
    }
}
