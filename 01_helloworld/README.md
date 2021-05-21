# JAVA第一堂課所學

## JAVA編譯
呼叫終端機 Win + R，cmd，enter  
指定路徑  
此檔案編譯方式  

1. cd C:\java\helloworld

### 無package的情況下的指令

2. 編譯 ```javac Test.java```
3. 執行 ```java Test```

### 有package的情況下的指令

2. 編譯 ```javac -d . Test.java```
3. 執行 ```java java1.helloworld.Test```


## 文件儲存編碼問題
vscode預設文件儲存編碼型態為UTF-8，此型態會造成中文成為亂碼  
以前學JAVA時是用記事本(TXT)跟Notepad++，兩者預設儲存編碼型態是ANSI，因此不會出現亂碼  
在vscode得先修改儲存編碼型態為Big5-HKSCS，這樣編碼就不會有問題了，修改地方在右下角修改(2021.05.21紀錄，位置可能因為版本更新而修改)  
  
***注意，如果是用編碼Big-HKSCS儲存，將其登入到github時會出現亂碼，必須是utf-8的編碼方式才不會變成亂碼，  
因此在編譯的時候加上-encoding utf-8來防止編譯錯誤***

### 使用utf-8編碼格式編譯具有中文內容的程式碼

#### 無package的情況下的指令
1. 編譯 ```javac -encoding utf-8 Test.java```
2. 執行 ```java Test```

#### 有package的情況下的指令
1. 編譯 ```javac -encoding utf-8 -d . Test.java```
2. 執行 ```java java1.helloworld.Test```

## 註解方式
/**/跟//，沒有變

## JAVA格式
主類別
```
public class Test{
   public static void main(String[] args){
       System.out.println("嗨 java");
   }
}
```

一般類別
```
class Myclass{

}
```