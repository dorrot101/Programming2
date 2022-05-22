// 練習問題13-4: 階乗の計算 FactorialTest.java

public class FactorialTest{
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int n){
        if(n == 1) return 1;
        else return n*factorial(n-1); 
    }
}