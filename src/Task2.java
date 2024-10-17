import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static List<String>  sortedInDescendingOrder(List<String> listLine){

        List<String> listLineSorted = listLine
                .stream()
                .map(s -> s.toUpperCase())
                .sorted(Comparator.comparing(String::valueOf).reversed())
                .collect(Collectors.toList());

        return listLineSorted;
    }

    public static void main(String[] args) {
        List<String> listName = new LinkedList<>();
        listName.add("John");
        listName.add("Bill");
        listName.add("Ivan");
        listName.add("Peter");
        listName.add("Kolya");
        System.out.println(Task2.sortedInDescendingOrder(listName ));
    }
}
