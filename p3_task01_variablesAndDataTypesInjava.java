import java.util.*;

public class p3_task01_variablesAndDataTypesInjava {
    static int q = 11; // static variable declaration

    public static void main(String[] args) {
        int a = 10; // local varible declaration
        System.out.println("a:" + a);
        System.out.println("q:" + q);
        newclass obj = new newclass(); // creating object
        System.out.println("p:" + obj.p);
        TypeconversionAndTypecasting();

    }

    static void TypeconversionAndTypecasting() {
        int e = 23;
        double d;
        d = e; // typeconversion from int double
        System.out.println("d:" + d);
        double u = 1023.987;
        int v = (int) u; // typecasting from double to int
        System.out.println("v:" + v);

    }

}

class newclass { // defining a new class
    int p = 100; // instance variable declaration
}