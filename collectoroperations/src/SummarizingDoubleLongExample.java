import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import static java.util.stream.Collectors.summarizingDouble;

public class SummarizingDoubleLongExample {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("j", "jy", "jyo", "jyot", "jyoti");
        DoubleSummaryStatistics result = nameChars.stream().collect(summarizingDouble(String::length));
        System.out.println("Max of lengths : " + result.getMax());
        System.out.println("Min of Lengths : " + result.getMin());
        System.out.println("Average of Lengths : " + result.getAverage());
        System.out.println("Count : " + result.getCount());
        System.out.println("Sum : " + result.getSum());


    }
}
