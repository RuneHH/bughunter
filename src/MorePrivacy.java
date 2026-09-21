/* Refaktorer Person, så den har en konstruktør
   og private felter.
*/

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}


void main() {
    Person p = new Person("Alice", 20);


    IO.println(p.name);
    IO.println(p.age);

}
