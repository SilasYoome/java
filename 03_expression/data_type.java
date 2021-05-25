package java2.expression;
import java.lang.*;
import java.util.Scanner;
public class data_type{
    public static void main(String args[]){
        short s=23;
        int a=100;
        char b='a';
        float c=3.5f;
        double d=4.8d;

        System.out.println("運算式資料型態轉換");
        System.out.print("result = ");
        System.out.println((s+a-b+c)+(c*d));    // 最後運算結果會轉換成double

        Scanner keyboardInput = new Scanner(System.in);
        String str1;
        double x;

        System.out.println("強制資料型態轉換");
        System.out.println("字串轉原始資料");
        System.out.print("欲求x的3次方，請輸入x:");
        str1 = keyboardInput.nextLine();
        x = Double.parseDouble(str1);       //字串轉原始資料型態
        System.out.println("x的3次方為:" + (x*x*x));

        System.out.println("原始資料轉字串兩種方式");
        short a2=100;
        int b2=200;
        float d2=3.5f;
        double e2=4.8d;
        String s1,s2;
        s1 = String.valueOf(a2+b2)+String.valueOf(a2)+String.valueOf(b2);   // 使用valueOf()多載方式將原始資料型態轉換成字串
        s2 = Float.toString(d2)+Double.toString(e2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}