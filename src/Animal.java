/**
 * Created by jonathangunnells on 5/16/16.
 */
public class Animal {
    String name;
    String species;
    boolean isFat;
    boolean isAlive;
    boolean isCarnivore;
    int age;

    public Animal() {

    }

    public Animal( String n, String s, boolean f, boolean a, boolean c, int g) {
        name = n;
        species = s;
        isFat= f;
        isAlive = a;
        isCarnivore = c;
        age = g;
    }

    public String getName() {

        return name;
    }

    public String getSpecies() {

        return species;

    }

    public boolean getIsFat() {

        return isFat;
    }

    public boolean getIsCarnivore() {

        return isCarnivore;
    }


    public int getAge() {

        return age;

    }

    public void setName() {


    }
}






