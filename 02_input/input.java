package java1.input;
import java.lang.*;
import java.util.Scanner;// 載入類別
import java.io.Console; //  另外一個輸入用的類別

public class input{
    public static void main(String args[]){
        Scanner KeyboardInput = new Scanner(System.in);// 宣告Scanner物件命名為KeyboardInput
        String str1,str2;

        System.out.println("使用Scanner的方式輸入");
        System.out.print("請輸入第一個字串:");
        str1 = KeyboardInput.nextLine();            //  利用nextLine取得鍵盤輸入的第一行字
        System.out.print("請輸入第二個字串:");
        str2 = KeyboardInput.nextLine();            //  利用nextLine取得鍵盤輸入的第二行字

        System.out.println("輸入的數值如下:");
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("使用Console的方式輸入");
        System.out.print("請輸入帳號:");
        Console console = System.console();
        String cstr1;
        char[] PW;
        cstr1 = console.readLine();
        PW = console.readPassword("請輸入密碼");

        System.out.print("帳號: ");
        System.out.println(cstr1);
        System.out.print("密碼: ");
        System.out.println(PW);


    }
}