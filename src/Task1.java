import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static String notAnEvenIndex(List<String> listNames){
        int i=0;
        StringBuilder stringName = new StringBuilder();
        for (String name : listNames){
            i++;
            if (i % 2 != 0){
                stringName.append(i+". "+name);
                if (i < listNames.size())
                    stringName.append(", ");
            }
        }

        return stringName.toString();
    }

    public static String notAnEvenIndex2(List<String> listNames){
//        Метод приймає на вхід список імен. Необхідно повернути рядок вигляду 1. Ivan, 3. Peter... лише з тими іменами,
//        що стоять під непарним індексом (1, 3 тощо)


//        AtomicInteger increment = new AtomicInteger();
//        AtomicInteger increment1 = new AtomicInteger();
//        increment.getAndIncrement(); // index++
//        increment1.getAndIncrement(); // index++
//        String stringNames = listNames
//                .stream()
//                .map((s) -> increment.getAndIncrement()+". "+s)
//                .filter((s) -> { int i = increment1.getAndIncrement(); return i % 2 != 0;})
//                .collect(Collectors.joining(", ","",""));

        StringBuilder arg0 = new StringBuilder();
        AtomicInteger increment = new AtomicInteger();
        increment.getAndIncrement();
        String stringNames = listNames
                .stream()
                .reduce(arg0,
                        (arg, s) -> {
                            int i = increment.getAndIncrement();
                            arg.append((i % 2 != 0)? i+". "+s : "");
                            arg.append((i % 2 != 0) && (i < listNames.size())? ", " : "");
                            return arg;
                        },(arg1, arg2) -> null
                )
                .toString();


        return stringNames;
    }

    public static void main(String[] args) {

        System.out.println(Task1.notAnEvenIndex(
                Stream.of("John", "Bill", "Ivan", "Peter", "Kolya")
                .collect(Collectors.toList())
        ));

        System.out.println("**********II*************");

        List<String> listName = new ArrayList<>();
        listName.add("John");
        listName.add("Bill");
        listName.add("Ivan");
        listName.add("Peter");
        listName.add("Kolya");
        System.out.println(Task1.notAnEvenIndex2(listName ));
    }
}
