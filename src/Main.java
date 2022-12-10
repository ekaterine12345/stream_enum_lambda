import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student student_1 = new Student(1, "ln1", "llpll1");
        Student student_2 = new Student(22, "Kaln2", "ll2");
        Student student_3 = new Student(13, "Kaln3", "ll3");
        Student student_4 = new Student(19, "nani", "ppp");

        List<Student> students = Arrays.asList(student_1, student_2, student_3, student_4);
       // System.out.println(students);
        Stream<Student> studentsStream = students.stream();

        List<Student> resultList = studentsStream
                .filter(s -> s.getName().startsWith("Ka"))
                .filter(s -> s.getId()==2)
                .map(s -> {
                    s.setName("new_Kato");
                    return  s;
                })
                .collect(Collectors.toList());

        System.out.println(resultList);

        List<Student> resultList2 = students.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(resultList2);

        Optional<Student> resList = students.stream()
                .filter(s->s.getName().startsWith("l"))
                .filter(s->s.getLastname().startsWith("ll"))
                //  .filter(s->s.getId()>=2)
                .map(s-> {
                    s.setName("new name");
                    return s;
                })
                .findFirst();
       // System.out.println(resList);
        System.out.println(resList.get());


        students.stream()
                .filter(s->s.getName().startsWith("na"))
                .filter(s->s.getLastname().startsWith("pp"))
                //  .filter(s->s.getId()>=2)
                .map(s-> {
                    s.setName("new name111");
                    return s;
                })
                .forEach(System.out::println);


        // System.out.println();
        // System.out.println(student_4);

        Stream<Student> studentStream_1 = Stream.of(student_1, student_2, student_3, student_4);

        List<Student> ansList = studentStream_1
                .filter(s->s.getName().startsWith("n"))
                        .collect(Collectors.toList());

        System.out.println(ansList);


        Stream<Student> streamBuilder =  Stream.<Student>builder().add(student_1).add(student_2).build();

        streamBuilder
                .filter(s -> s.getId() ==19)
                .forEach(System.out::println);

        Stream<String> stringStream = Stream.generate(()->"lika").limit(10); // iterate me vnaxo

        stringStream.forEach(System.out::println);

    }
}