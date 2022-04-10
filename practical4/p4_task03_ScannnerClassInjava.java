

import java.util.*;

public class p4_task03_ScannnerClassInjava {
    public static void main(String[] args) {
        Scanner myobj1 = new Scanner(System.in);
        Scanner myobj2 = new Scanner(System.in);
        String firstname = myobj1.next();
        System.out.println("name is:" + firstname + "\n");
        String name = myobj2.nextLine();
        String name2 = myobj2.nextLine();
        System.out.println("name is:" + name + "\n");
        System.out.println("name is:" + name2 + "\n");
        boolean b = myobj2.nextBoolean();
        System.out.println(b + "\n");
        myobj1.close();
        myobj2.close();

    }

}
