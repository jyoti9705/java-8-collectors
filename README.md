# java-8-collectors

1. Stream.collect is one of the Java 8 Stream Operations used to perform mutable fold operations on the elements of the
   stream held in Stream Instance
2. .collect is one of the terminal operations in Java8
3. The Strategy for these operations are provided using Collector interface implementation
4. It is good practice to leverage Collectors predefined methods using static imports
5. .toList()
    1. Is used to collect all the elements of the stream into a list
    2. Important point to remember is that we cannot assume any particular list implementation with this method
    3. To have more control over this we can make use of toCollection instead
    4. toCollection will not work with any immutable collection elements in that case we will have to make use of custom
       collector or collectionAndThen implementation
    5. Java 10 introduced convenient method to collect elements into list that cannot be modified using
       toUnModifiableList();
    6. If we further modify the elements of the unmodifiable list UnSupportedOperationException will be thrown
6. .toSet()
    1. To Set is used to collect all the elements of the stream into a set
    2. Important point to remember is that we cannot assume any particular set implementation with this method
    3. To have more control over this we can make use of toCollection instead
    4. toCollection will not work with any immutable collection elements in that case we will have to make use of custom
       collector or collectionAndThen implementation
    5. In Java 10 introduced a convenient method to collect elements in form of unmodifiable set with help of
       toUnmodifiableSet();
    6. If we attempt to modify elements of the unmodifiable set we will get UnsupportedOperationException
    7. Set will not duplicate elements of set
7. toMap()
    1. toMap is used to store elements of the stream into a Map Instance
    2. To do this we will have to provide 2 values
        1. KeyMapper
            1. KeyMapper is used to extract key from the Stream elements
        2. ValueMapper
            1. ValueMapper is used to extract values from the Stream elements
    3. Function.Identity
        1. Function.Identity is used to accept and return the same values
    4. If there are duplicate elements in the Map the toMap method will not even evaluate values for them, it will
       straight away throw IllegalStateException
    5. To work with duplicate values we will have to provide another Binary Operator which will specify that if two
       values are spotted pick any one of them or accordingly behaviour when duplicates are found
    6. Java 10 introduced another convenient method along with set and list to collect stream in unmodifiable map using
       toUnModifiableMap
    7. Any operation performed on unmodifiable map will throw unsupported operation exception
8. CollectingAndThen
    1. CollectingAndThen allows us to perform operation on the elements as soon as we have collected them
    2. Which means operations on elements after collecting but not yet finalised in which form we have collected
9. .joining()
    1. Joining collector is used to join stream of string elements
    2. We can also specify seperators , Pre and Post elements of the string after joined using separator
10. .counting()
    1. Counting is a simple collector that provides us count of all the elements in stream
11. summarizingDouble/Long
    1. SummarizingDouble/Long returns a special class containing statistics of numerical data in stream of extracted
       elements
12. Averaging Double/long/Int
    1. Averaging Double/Long.Int is a collector that returns average of extracted elements
13. Summing Double/Long/Int
    1. Return sum of extracted elements
14. minBy/maxBy
    1. Returns smallest and greatest elements in the stream as per comparator instance
15. groupingBy()
    1. GroupingBy is used to group elements based upon the property provided, and it returns a map whose value will be
       datatype of property provided.
    2. Second argument is the collector, and we are free to use any collector we want
16. partitioningBy()
    1. PartitioningBy is specialised groupingBy where we pass predicate as input and return type is Map with key as true
       or false boolean and values are collections qualifying the predicate
    2. Under true there will of collection of elements satisfying the predicate and under false there will be list of
       elements not qualifying the predicate
17. teeing()
    1. Java12 offers a built-in functionality to tie the output of two collectors and use it for meaningful output
