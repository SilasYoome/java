package java1.expression;
import java.lang.*;

public class var_value{
    public static void main(String args[]){
        // var變數只適用於JDK11之後
        var a=100;      // 區域變數a會被判斷成int，而非short
        var b=200;
        var d=3.5f;
        var e=4.8d;
        // 不可設定d=e，但可設定e=d

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}