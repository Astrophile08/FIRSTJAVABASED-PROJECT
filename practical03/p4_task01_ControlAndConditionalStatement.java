
import java.util.*;

public class p4_task01_ControlAndConditionalStatement {
    public static void main(String[] args) {
        statements obj = new statements();
        obj.decisionMakingStatement();
        obj.loopStatement();
        obj.jumpStatement();

    }

}

class statements {
    void decisionMakingStatement() {
        System.out.println("Decision making");
        int x = 10;
        int y = 12;
        if (x + y < 10) {
            System.out.println("x+y is less than  10");
        } else {
            System.out.println("x+y is greater than  10");
        }
        int num = 2;
        switch (num) {
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);
        }

    }

    void loopStatement() {
        // initialize,condition,updation
        // for loop

        System.out.println();
        System.out.println();
        System.out.println("loop statements");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }
        System.out.print("sum:" + sum + " ");
        System.out.println();
        // while loop
        int i = 0;
        System.out.println("list of first 10 even number ");
        while (i <= 10) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
        // do-while loop
        i = 0;
        System.out.println("list of first 10 even number");
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 10);

    }

    void jumpStatement() {

        // break
        System.out.println();
        System.out.println();
        System.out.println("jump staements");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 6)
                break;

        }
        System.out.println();
        /// continue
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 6)
                continue;

        }
    }
}
