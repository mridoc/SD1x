package week1;

public class Person {
    //fields
    
    String name;
    int age;
    boolean male;
    
    //constructor
    Person (String name, boolean male) {
        this.name = name;
        this.male = male;
        age = 0;
    }
    
    //methods
    String getName() {
        return name;
    }
    
    boolean isAdult (int age){
        int magicAge = 21;
        return age >= magicAge;
    }
    
    void birthday() {
        age = age + 1;
        System.out.println("Happy Birthday!");
    }

}
