import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] arr = new String[]{"Vasya", "Oleg", null, "Petya", "Oleg", "Maleg", "asdasdsa", "Petya", null, null};

        Set<String> list = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                list.add(arr[i]);
            }
        }

        arr = list.toArray(String[]::new);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb = sb.append(arr[i]);
        }

        String result = sb.toString();
        System.err.println(Arrays.toString(arr));
        System.out.println(result);
    }
}