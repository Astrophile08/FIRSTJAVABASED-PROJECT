

import java.util.*;

public class p4_Task_02_WrapperClassesInJava {
    public static void main(String[] args) {
        int a = 20;
        String s = "" + a + "";
        Integer i = Integer.valueOf(a);// convert int into Integer explicitly
        Integer j = a;
        // autoboxing, now converting primitives into objects
        byte b = 10;
        Byte byteobj = b;
        System.out.println(byteobj);
        // unboxing converting objects to primitives
        byte bytevalue = byteobj;
        System.out.println(bytevalue);

    }
}
