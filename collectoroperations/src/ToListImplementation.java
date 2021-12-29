import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;

public class ToListImplementation {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("j", "jy", "jyo", "jyot", "jyoti");

        //toList
        List<String> values = nameChars.stream().collect(toList());
        System.out.println(values);

        //toUnmodifiableList
        List<String> unmodifiableValues = nameChars.stream().collect(toUnmodifiableList());
        System.out.println(unmodifiableValues);

        //toCollection
        List<String> toCollectionValues = nameChars.stream().collect(toCollection(ArrayList::new));
        System.out.println(toCollectionValues);
    }
}
