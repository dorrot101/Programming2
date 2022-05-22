// 練習問題13-2: List 13-3の改造 ExceptionTest3.java

public class ExceptionTest3{
    public static void main(String[] args) {
        int[] myarray = new int[3];
        myAssign(myarray, 2, 0);
        myAssign(myarray, 100, 0); 
    }

    static void myAssign(int[] arr, int index, int value){
        try{
            System.out.println("myAssignに来ました");
            System.out.println("代入します。");
            arr[index] = value;
            System.out.printf("arr[%d] = %d %n", index, value);
            System.out.println("代入しました。");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("代入できませんでした。");
            System.out.println("例外は"+ e +"です。");
        } finally {
            System.out.println("終了しました。");
            System.out.println("myAssignから帰ります" + '\n');
        }      
    }
}