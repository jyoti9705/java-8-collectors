import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class JoiningExample {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("j", "jy", "jyo", "jyot", "jyoti");
        String elementsJoinedWithoutParameters = nameChars.stream().collect(joining());
        System.out.println("Without delimiters , prefix and postfix : ".concat(elementsJoinedWithoutParameters));

        String elementsJoinedWithParameters = nameChars.stream().collect(joining(" ", "PRE-", "-POST"));
        System.out.println("Elements joined with Parameters  :  ".concat(elementsJoinedWithParameters));
    }
}
