import java.util.*;

public class p2_Task02_constatntsInJava {
    static final float pi = 3.14f; // global constant

    public static void main(String[] args) {
        final int r = 10; // local constatnt
        float area = pi * r * r;
        System.out.println(area);
    }

}
