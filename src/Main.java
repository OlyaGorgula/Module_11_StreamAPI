import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("John", "Bill");
        Stream<String> nameStream = names.stream();
        nameStream.map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));


        Stream<Integer> even = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                        .stream()
                        .filter(number -> number%2 == 0);


        Stream<String> names1 =
                Arrays.asList("John", "Bill", "Max", "Alex")
                        .stream()
                        .filter(name -> name.length() > 3)
                        .map(name -> "Mr/Ms " + name)
                        .sorted()
                        .limit(2);

        Stream<Integer> intStream = Stream.of(1, 2, 5);

        Stream<String> intStream1 = Stream.of("1", "2", "5");

        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}