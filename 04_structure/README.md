# 流程控制

## JAVAk的邏輯結構
java允許的基本邏輯結構有三種：循序、選擇與迴圈

### 選擇結構
直接簡單的結構，執行順序是由上而下一個接著一個依序執行

### 選擇結構
會依據條件而適當的改變程式執行順序

### 迴圈結構
重複執行某個程序，直到規定的條件後才停止重複

## 選擇性敘述
### ```if...``` ```else...``` ```elseif...```
  
結構
```
if(條件運算式){

}
```
```
if(條件運算式){

}else{

}
```
### ```e1?e2:e3```

結構
```
變數 = (條件運算式1)?(運算式2):(運算式3);
```

### ```switch...case...```

結構
```
switch(字串運算式){
    cass 字串常數值1:
        敘述區塊1...
        break;

    cass 字串常數值2:
        敘述區塊2...
        break;
    :
    :
    cass 字串常數值n:
        敘述區塊3...
        break;
    default:
        ...敘述區塊...
        break;
}
```