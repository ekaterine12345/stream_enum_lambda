import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Stream<Integer> evenNumInfiniteStream = Stream.iterate(3, n -> n + 3);

        List<Integer> newList = evenNumInfiniteStream.limit(10)
                .collect(Collectors.toList());

        System.out.println(newList);

        Stream<Integer> newStream = Stream.iterate(7, n->n*2);
        List<Integer> newList1 = newStream.limit(20)
                .collect(Collectors.toList());

        System.out.println(newList1);
    }
}
