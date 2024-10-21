
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Task5 {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){

        List<T> listRes = new ArrayList<>();

        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()){
            listRes.add(iteratorFirst.next());
            listRes.add(iteratorSecond.next());
        }

        return listRes.stream();
    }

    public static void main(String[] args) {
//        Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
//        який "перемішує" елементи зі стрімів first та second, зупиняючись тоді, коли у одного зі стрімів закінчаться елементи.

        Stream<String> first = Stream.of("a","e","i","u");
        Stream<String> second = Stream.of("J","B","C","D","F","M");
        zip(first, second).forEach(n -> System.out.print(n));
    }
}
