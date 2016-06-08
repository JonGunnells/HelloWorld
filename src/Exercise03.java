import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Exercise03 {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Andrew", "Edward"};

        //Arraylist<String> that contains the names with only capital letters
        //filter out names that dont start with "A"
        //{Alice, Andrew}

        //solution 1 modify index after recording
        ArrayList<String> newNames = new ArrayList<>();
        for (String name : names) {
            newNames.add(name.toUpperCase());
        }
        for (int i = 0; i < newNames.size(); i++) {
            String name = newNames.get(i);
            if (!name.startsWith("A")) {
                newNames.remove(i);
                i--;
            }
        }
        System.out.println(newNames);

        //solution 2: use Temporary collections
       // newNames = new ArrayList<>();
        //for (String name: names) {

         //   if (name.startsWith("A")) {
       //         tempNames.add(name);
       //     }
       // }
        //System.out.println(tempNames);


        //solution 3: use iterator
        newNames = new ArrayList<>();
        for (String name : names) {
            newNames.add(name.toUpperCase());
        }
        Iterator<String> iter = newNames.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (name.startsWith("A")) {
                iter.remove();
            }
        }
        System.out.println(newNames);

        //solution 4; use a stream (functional programming)
        //map: run function on every item in collection
        //filter: return only items that function is true for
        newNames = new ArrayList<>();
        for (String name: names) {
            newNames.add(name);
        }
        newNames = newNames.stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));//what do you want it to give you back
        System.out.println(newNames);
    }
}