import java.util.ArrayList;
import java.util.Comparator;
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
//        Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
//        Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).

        List<String> listName = new ArrayList<>();
        listName.add("John");
        listName.add("Bill");
        listName.add("Ivan");
        listName.add("Peter");
        listName.add("Kolya");
        System.out.println(Task2.sortedInDescendingOrder(listName ));
    }
}
