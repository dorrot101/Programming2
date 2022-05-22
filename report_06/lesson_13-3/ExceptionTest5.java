// 練習問題13-3: List 13-8の改造 ExceptionTest5.java

public class ExceptionTest5{
    public static int[] testArr = new int[5];
    public static void main(String[] args) {
        try{
            method1(2);
            method2(5);
            method3(7);
        } catch(Exception e){
            //保安上弱点がありえる。
            e.printStackTrace();
        }
    }

    static void method1(int x) throws Exception{
        System.out.println("METHOD1 START");
        System.out.println("myAssignに来ました");
            System.out.println("代入します。");
            testArr[x] = 1;
            System.out.printf("arr[%d] = %d %n", x, 1);
            System.out.println("代入しました。" + '\n');
    }
    static void method2(int x) throws Exception{
        System.out.println("METHOD2 START");
        System.out.println("myAssignに来ました");
            System.out.println("代入します。");
            testArr[x] = 2;
            System.out.printf("arr[%d] = %d %n", x, 2);
            System.out.println("代入しました。" + '\n');
    }
    static void method3(int x) throws Exception{
        System.out.println("METHOD3 START");
        System.out.println("myAssignに来ました");
            System.out.println("代入します。");
            testArr[x] = 3;
            System.out.printf("arr[%d] = %d %n", x, 3);
            System.out.println("代入しました。"+ '\n');
    }
}