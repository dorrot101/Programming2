import java.util.Scanner;

// 課題2: 自作の例外クラスを作る RangeAddTester.java

public class RangeAddTester{
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("整数a:"); int a = In.nextInt();
        System.out.println("整数b:"); int b = In.nextInt();

        try{
            System.out.println("結果は"+RangeAdd.add(a,b)+"です。");
        } catch(NotNaturalNumber e){
            System.out.println("エラーです。" + e.getMessage());
        }
    }
}