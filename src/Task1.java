import java.util.ArrayList;
import java.util.List;
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
        StringBuilder arg0 = new StringBuilder();
        arg0.append("/0");
        String stringName = listNames
                .stream()
                .reduce(arg0,
                        (arg, s) -> {
                            String[] arrayStr = arg.toString().split("/");
                            arg.delete(0,arg.length());
                            arg.append(arrayStr[0]);
                            int i = Integer.parseInt(arrayStr[1]);
                            i++;
                            arg.append((i % 2 != 0)? i+". "+s : "");
                            arg.append((i % 2 != 0) && (i < listNames.size())? ", " : "");
                            arg.append((i < listNames.size())? "/"+i : "");
                            return arg;
                        },(a1, a2) -> null
                        ).toString();

        return stringName;
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
