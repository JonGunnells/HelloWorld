import java.util.Arrays;


public class Person implements Comparable {
    static int familySize = 10;
    String name;
    int age;
    boolean isAlive;
    Person[] family = new Person [familySize];

    public Person(){

    }

    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;



    }

    public String getName() {
        return name;

    }

    public void setName(String newName) {
        //if (isValidName(newName)) {
            name = newName;
       // }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;

    }

    public boolean getIsAlive() {
        return isAlive;

    }

    public void setIsAlive(boolean newIsAlive) {
        isAlive = newIsAlive;

    }

    public static boolean isValidName(String newName) {
        return newName.contains(" ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", family=" + Arrays.toString(family) +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Person otherPerson = (Person) o;
        return this.name.compareTo(otherPerson.name);
    }
}


