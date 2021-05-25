package java1.expression;
import java.lang.*;


public class operators{
    public static void main(String args[]){
        float answer;
        float a=2.1f,b=3.5f,c=4.0f;             // float常數，要在尾部加上f

        int x,y;
        x = 20;
        y = 7;

        System.out.println("算術運算子");
        System.out.print("當x=" + x + " ");
        System.out.println("y=" + y +"時");
        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x * y = " + (x*y));
        System.out.println("x / y = " + (x/y));
        System.out.println("-------------------------");
        System.out.print("當a =" + a + " ");
        System.out.print("b =" + b + " ");
        System.out.println("c" + c + "時");
        answer = b*b-4*a*c;
        System.out.println("b^2-4ac =" + answer);
        
        System.out.println("=========================");
        System.out.println("比較運算子");

        int x2 = 10,y2 = 20;
        boolean a2=true, b2=false;

        System.out.print("x=" + x2);
        System.out.println(" y=" + y2);
        System.out.println("-------------------------");
        System.out.println("x==y ==> " + (x2==y2));
        System.out.println("x!=y ==> " + (x2!=y2));
        System.out.println("x>y ==> " + (x2>y2));
        System.out.println("x<y ==> " + (x2<y2));
        System.out.println("x>=y ==> " + (x2>=y2));
        System.out.println("x<=y ==> " + (x2<=y2));
        System.out.println("=========================");
        System.out.println("邏輯運算子");
        System.out.print("a=" + a2);
        System.out.println(" b=" + b2);
        System.out.println("-------------------------");
        System.out.println("not a   ==> " + !a2);
        System.out.println("a and b     ==> " + (a2 && b2));
        System.out.println("a or b     ==> " + (a2 || b2));
        System.out.println("a nand b     ==> " + !(a2 && b2));
        System.out.println("a nor b     ==> " + !(a2 || b2));
        System.out.println("a and (x<y)     ==> " + (a2 && (x2<y2)));

        short x3=100,y3=50,p3=3;
        int xx = 0;
        System.out.println("=========================");
        System.out.println("位元運算子");
        System.out.println("p = 3");
        System.out.println("x = 01100100");
        System.out.println("y = 00110010");
        System.out.println("-------------------------");
        System.out.println("not xx  ==> " + ~xx);
        System.out.println("a and y ==> " + (x3 & y3));
        System.out.println("a or y ==> " + (x3 | y3));
        System.out.println("a xor y ==> " + (x3 ^ y3));
        System.out.println("x >>> p ==> " + (x3 >>> p3));
        System.out.println("a <<< y ==> " + (x3 << p3));

        
    }
}