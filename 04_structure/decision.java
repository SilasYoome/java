package java1.decision;
import java.lang.*;
import java.util.Scanner;

public class decision{
    public static void main(String args[]){
        Scanner keyboardInput = new Scanner(System.in);
        int x;
        String str1 = new String("您輸入的是正數或0");
        /***************************
            if()...範例
        ****************************/
        System.out.print("請輸入一個數字:");
        x =  Integer.parseInt(keyboardInput.nextLine());
        if(x<0)
            str1 = "您輸入的是負數";
        System.out.println(str1);


        /***************************
            if()...else()...範例
        ****************************/
        int OnePrice = 200,Qty;
        double TotalPrice;

        System.out.println("每張入場卷價格為" + OnePrice + "元");
        System.out.print("請輸入您要購買的張數:");
        Qty = Integer.parseInt(keyboardInput.nextLine());
        System.out.println("==============================");
        if(Qty >= 10){
            TotalPrice = OnePrice * Qty * 0.9;
            System.out.println("購買10張以上打九折");
        }else{
            TotalPrice = OnePrice * Qty;
            System.out.println("您未購買10張以上的入場卷，恕不打折");
        }
        System.out.println("總價為" + TotalPrice + "元");



        /***************************
            e1?e2:e3範例
        ****************************/
        String str2 = new String("恭喜您猜到了，獎品是一包乖乖");
        int Ans = 38;    // 答案是38
        int Guess;

        System.out.print("請猜一個1~99的號碼");
        Guess = Integer.parseInt(keyboardInput.nextLine());
        if(Guess != Ans)
            str2 = (Guess>Ans) ? "您猜得太大了" : "您猜得太小了";
        System.out.println(str2);

        


        /***************************
            else if...範例
        ****************************/
        int Score;
        System.out.print("請輸入計概成績:");
        Score = Integer.parseInt(keyboardInput.nextLine());
        if(Score<60){ System.out.println("分數等級是丁等");}
        else if(Score <= 69){ System.out.println("分數等級是丙等");}
        else if(Score <= 79){ System.out.println("分數等級是乙等");}
        else if(Score <= 89){ System.out.println("分數等級是甲等");}
        else if(Score <= 99){ System.out.println("分數等級是優等");}
        else if(Score == 100){ System.out.println("完美分數");}
        else{ System.out.println("您輸入了不合法的分數");}


        /***************************
            switch case...範例
        ****************************/


        switch(Score/10){
            case 10:
                System.out.println("完美分數");
                break;
            case 9:
                System.out.println("分數等級是優等");
                break;
            case 8:
                System.out.println("分數等級是甲等");
                break;
            case 7:
                System.out.println("分數等級是乙等");
                break;
            case 6:
                System.out.println("分數等級是丙等");
                break;
            default:
                System.out.println("分數等級是丁等");
                break;
        }
        


        /***************************
            switch case...範例(字串條件)
        ****************************/
        System.out.print("請輸入計概等第(中文):");
        switch(keyboardInput.nextLine()){
            case "優等":
                System.out.println("英文等第為A");
                break;
            case "甲等":
                System.out.println("英文等第為B");
                break;
            case "乙等":
                System.out.println("英文等第為C");
                break;
            case "丙等":
                System.out.println("英文等第為D");
                break;
            case "丁等":
                System.out.println("英文等第為F");
                break;
            default:
                System.out.println("您輸入了錯誤的等第");
                break;
        }
    }
}
