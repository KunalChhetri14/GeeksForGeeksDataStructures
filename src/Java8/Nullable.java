package Java8;

import java.util.Optional;

class Student {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age;

}

public class Nullable {



    public static void main(String args[]) {
        Optional<Student> s = Optional.ofNullable(new Student());
//        Student s = new Student();
        String name = s.map(Student::getName).orElse("Empty");
        System.out.println(s+ "  " +name);
    }


}
