package java1.input;
import java.lang.*;
import java.util.Scanner;// ���J���O
import java.io.Console; //  �t�~�@�ӿ�J�Ϊ����O

public class input{
    public static void main(String args[]){
        Scanner KeyboardInput = new Scanner(System.in);// �ŧiScanner����R�W��KeyboardInput
        String str1,str2;

        System.out.println("�ϥ�Scanner���覡��J");
        System.out.print("�п�J�Ĥ@�Ӧr��:");
        str1 = KeyboardInput.nextLine();            //  �Q��nextLine���o��L��J���Ĥ@��r
        System.out.print("�п�J�ĤG�Ӧr��:");
        str2 = KeyboardInput.nextLine();            //  �Q��nextLine���o��L��J���ĤG��r

        System.out.println("��J���ƭȦp�U:");
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("�ϥ�Console���覡��J");
        System.out.print("�п�J�b��:");
        Console console = System.console();
        String cstr1;
        char[] PW;
        cstr1 = console.readLine();
        PW = console.readPassword("�п�J�K�X");

        System.out.print("�b��: ");
        System.out.println(cstr1);
        System.out.print("�K�X: ");
        System.out.println(PW);


    }
}