import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;

public class CollectingAndThenExample {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("jy", "jyo", "jyot", "jyoti");
        //collectingAndThen
        Object collectingValues = nameChars.stream().collect(collectingAndThen(toList(),List::size));
        System.out.println(collectingValues);
    }
}
