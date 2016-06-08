import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("names.txt");

        FileWriter fw = new FileWriter(f);
        fw.write("Alice\n"); //will overwrite the file if it exists
        fw.append("Bob\n"); //adds on to file
        fw.append("Charlie\n");
        fw.close(); //have to close after write always

        //read line by line
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());

        }
        //square brackets turn into array lists, curly braces turn into hashmaps
        //read entire file (this is what you're looking for to stop reading)
        scanner = new Scanner(f);
        scanner.useDelimiter("\\z");
        System.out.println(scanner.next());
    }
}
