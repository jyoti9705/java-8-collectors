import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("j", "jy", "jyo", "jyot", "rit", "rites", "jyoti");
        //works with one argument
        //Map<Integer,List<String>> groupingByMap = nameChars.stream().collect(groupingBy(String::length));
        //works with two argument as well
        Map<Integer, List<String>> groupingByMap = nameChars.stream().collect(groupingBy(String::length, toList()));
        System.out.println("Map grouped by string length : " + groupingByMap);
    }
}
