import java.util.Arrays;

public class Task3 {
    public static void sortedNumber(String[] arrayLine){
        Arrays.stream(arrayLine)
                .flatMapToInt(s ->
                        Arrays.stream(s.split(", "))
                        .mapToInt(Integer::parseInt)
                )
                .sorted()
                .forEachOrdered(s->System.out.print(s+", "));
    }

    public static void main(String[] args) {
        //["1, 2, 0", "4, 5"]
        String[] arrayLine = {"1, 2, 0","4, 5"};
        Task3.sortedNumber(arrayLine);
    }
}
