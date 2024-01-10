package Java8.StreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {

    Person(String name, int age, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return this.name + " , "+ this.getAge() + "  ,"+ this.getSalary();
    }

    int age;
    String name;
    int salary;



}

public class SortStreams {

    public static void main(String args[]) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "carrot");

        //ascending order
        fruits = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        fruits = fruits.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList());
        fruits.forEach(System.out::println);

        //descending order
//        System.out.println()
        fruits = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        fruits.forEach(System.out::println);
        fruits = fruits.stream().sorted((a,b)-> b.compareTo(a)).collect(Collectors.toList());
        fruits.forEach(System.out::println);


        System.out.println("For objects::::::");

        Person person = new Person("Kunal", 29, 5600);
        Person person2 = new Person("Sandhya", 48, 6600);
        Person person3 = new Person("Kumar", 50, 3600);
        Person person4 = new Person("Kajal", 27, 8600);

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        List<Person> ascendingPersonList = personList.stream().sorted(Comparator.comparingInt(Person::getSalary))
                                                        .collect(Collectors.toList());

        List<Person> ascendingPersonListCustom = personList.stream().sorted((a,b)-> a.getSalary() - b.getSalary()).collect(Collectors.toList());

        System.out.println(ascendingPersonList);
        System.out.println("using lambdas __> "+ascendingPersonListCustom);
    }

}
