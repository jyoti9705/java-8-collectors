import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static java.util.stream.Collectors.*;

public class ToSetImplementation {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("j", "jy", "jyo", "jyot", "jyoti");
        Set<String> set = nameChars.stream().collect(toSet());
        System.out.println(set);

        //using toCollection implementation
        Set<String> toCollectionSetImplementation = nameChars.stream().collect(toCollection(TreeSet::new));
        System.out.println(toCollectionSetImplementation);

        //using toUnmodifiableSet
        Set<String> toUnModifiableSet = nameChars.stream().collect(toUnmodifiableSet());
        System.out.println(toUnModifiableSet);
    }
}
