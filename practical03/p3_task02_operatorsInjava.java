package practical03;
import java.util.*;
public class p3_task02_operatorsInjava {
    public static void main(String[] args) {
        OperatorsInJava obj=new  OperatorsInJava();
        obj.unaryOperator();
        System.out.println();
        obj.AirthmaticOperator();
        System.out.println();
        obj.shiftOperators();
        System.out.println();
        obj.relationalOperators();
        System.out.println();
        obj. BitwiseAndLogicalOperators();
        System.out.println();
        obj. TernaryOperators();
        
    }
    
}
class OperatorsInJava{
    void  unaryOperator()
    {
        int a=10;
        System.out.println("UnaryOperator");
        System.out.println(a++);//10
        System.out.println(a--);//11
        System.out.println(++a);//11
        System.out.println(--a);//10
    }
    void AirthmaticOperator()
    {
        int a=10;
        int b=5;
        System.out.println("AirthmaticOperator");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println("evaluate expression- 10*10/5+3-1*4/2");
        System.out.println( 10*10/5+3-1*4/2);

    }
    void shiftOperators()
    {
        System.out.println("shiftOperator");
        System.out.println(10<< 2); //40
        System.out.println(20>>3); //2
    }
    void relationalOperators()
    {
        System.out.println("realtionalOperator");
        int a=10;
        int b=20;
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a!=b);

    }
    void BitwiseAndLogicalOperators()
    {
        System.out.println("Inside LogicalOperator");
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b && a++<c);//false
        System.out.println(a>b||a<c);//true
        System.out.println("Inside bitwiseOperator");//always check both condition
        System.out.println(a<b & a++<c);//false
        System.out.println(a>b|a<c);//true


    }
    void TernaryOperators()
    {
        int a=2;
        int b=5;
        int min=(a<b)?a:b;
        System.out.println(min);
    }
}
