import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static String sortedNumber(String[] arrayLine){
        return Arrays.stream(arrayLine)
                .flatMapToInt(s ->
                        Arrays.stream(s.split(", "))
                        .mapToInt(Integer::parseInt)
                )
                .sorted()
                .mapToObj(n -> ""+n)
                .collect(Collectors.joining(", ","",""));
    }

    public static void main(String[] args) {
//        Є масив:
//        ["1, 2, 0", "4, 5"]
//        Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому , наприклад:
//        "0, 1, 2, 4, 5"

        String[] arrayLine = {"1, 2, 0","4, 5"};
        System.out.println(Task3.sortedNumber(arrayLine));
    }
}
