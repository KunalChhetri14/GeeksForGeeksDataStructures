package Java8;

@FunctionalInterface
interface A1 {

    public void m3();
    public static void m1() {
        System.out.println("Inside m1 inside A1 interface");
    }

    public default void m2() {
        System.out.println("Inside m2 inside A1 interface");
    }
}

public class DefaultStaticMethodsInterface {

    public static void main(String args[]) {

        A1.m1();
        A1 a = () -> System.out.println("Inside funcitona");
        a.m3();
//        DefaultStaticMethodsInterface defaultStaticMethodsInterface = new DefaultStaticMethodsInterface();
//        defaultStaticMethodsInterface.m2();
//        A1.super.m2();

    }

}
