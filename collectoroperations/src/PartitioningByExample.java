import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

public class PartitioningByExample {
    public static void main(String[] args) {
        List<String> nameChars = Arrays.asList("j", "jy", "jyo", "jyot", "rit", "rites", "jyoti");
        Map<Boolean, List<String>> map = nameChars.stream().collect(partitioningBy(s -> s.length() > 2));
        System.out.println("Partition depending upon String length greater than 2 : keys = " + map.keySet() + " values = "+ map.values());
    }
}
