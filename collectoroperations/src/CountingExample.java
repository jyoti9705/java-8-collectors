import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.counting;

public class CountingExample {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("j", "jy", "jyo", "jyot", "jyoti");
        Long count = nameChars.stream().collect(counting());
        System.out.println("Count of the elements in the Stream using counting collector method is : ".concat(count.toString()));
    }
}
