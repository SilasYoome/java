# Input與Output

## 練習兩種輸入的方式與一種輸出的方式

### Scanner
載入類別:
```import java.util.Scanner```

類別宣告:
```Scanner keyboardInput = new Scanner(System.in);```

利用nextLine來取得輸入的字串，並放入str1中:
```str1 = keyboardInput.nextLine();```

### Console
載入類別:
```import java.io.Console;```

類別宣告:
```Console console = System.console();```

Console有特別兩種輸入方式，一般的讀取readLine以及可適用於密碼輸入的readPassword

一般輸入並放入cstr1之中:
```cstr1 = console.readLine();```

密碼輸入放入char[] PW中:
```PW = console.readPassword("請輸入密碼");```