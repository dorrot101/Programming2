// 演習問題2: 文字列探索プログラムの改良 SearchString2.java
import java.util.Scanner;

public class SearchString2{
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        String s1;
        String s2;
        int index = 0;
        
        System.out.print("文字列１：");
        s1 = In.nextLine();
        System.out.print("文字列２：");
        s2 = In.nextLine();

        index = s1.length()>=s2.length()?s1.indexOf(s2):s2.indexOf(s1);
       
        if(index == -1) System.out.println("重なる所がいません。");
        else if(index == s1.indexOf(s2)){
            System.out.println(s1);
            for(int i = 0; i<index; i++){
                System.out.print(' ');
            }
            System.out.println(s2);
        }
        else{
            System.out.println(s2);
            for(int i = 0; i<index; i++){
                System.out.print(' ');
            }
            System.out.println(s1);    
        }
    }
}