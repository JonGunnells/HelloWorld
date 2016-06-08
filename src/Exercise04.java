import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Exercise04 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "James", "Charlie", "Brown"};


        //solution 1: traditional for loop
        HashMap<String, String> namesMap = new HashMap<>();
        for (int i = 0; i < names.length; i += 2) {
            String firstName = names[i];
            String lastName = names[i + 1];
            namesMap.put(lastName, firstName);
        }
        //solution 2 splitting an array into pairs then putting them in hashmap seperately
        namesMap = new HashMap<>();
        ArrayList<String> namesArr = new ArrayList<>(Arrays.asList(names));
        ArrayList<String> pair;
        while (namesArr.size() > 0); {
            pair = (ArrayList<String>) namesArr.subList(0, 2);
            namesArr = new ArrayList<>(namesArr.subList(2, namesArr));
            namesMap.put(pair.get(1));

    }
}
