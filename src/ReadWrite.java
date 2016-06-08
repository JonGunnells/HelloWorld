import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        HashMap person = new HashMap();
        person.put ("name", "Alice");
        person.put ("age", 30);


        Person person2 = new Person();

        File f = new File("person.json");

        //write json
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(person);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        //read json
        Scanner scanner = new Scanner(f);
        scanner.useDelimiter("\\z");
        String contents = scanner.next();
        JsonParser parser = new JsonParser();
        //HashMap person3 = parser.parse(contents);
        Person person3 = parser.parse(contents, Person.class);
        System.out.println(person3);

    }
}
