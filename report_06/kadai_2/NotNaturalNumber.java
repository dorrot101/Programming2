// 課題2: 自作の例外クラスを作る NotNaturalNumber.java

public class NotNaturalNumber extends RuntimeException{

    NotNaturalNumber(int n){
        super("自然数ではない : " + n);
    }
}