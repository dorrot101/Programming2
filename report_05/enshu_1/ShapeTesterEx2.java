// 演習問題1: 図形クラス群の拡張2 ShapeTesterEx2.java
import java.util.Scanner;

public class ShapeTesterEx2{
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int size;
        int option;
        int width;
        int height;
        System.out.print("オブジェクトの個数は？ : ");
        size = In.nextInt();

        Shape[] shapeset = new Shape[size];   
        for(int i =0; i<size; i++){
            do{
                System.out.print(i+"番目の図形の種類( [1] Rectangle [2] Parallelogram ) : ");
                option = In.nextInt();
            }while(option < 1 || option >2);
            do{
                System.out.print("幅 : ");
                width = In.nextInt();
                System.out.print("長さ : ");
                height = In.nextInt();
            }while(width <= 0 || height <= 0);
            
            if(option == 1) shapeset[i] = new Rectangle(width, height);
            else shapeset[i] = new Parallelogram(width, height);
        }System.out.println();

        int count = 0;
        for(Shape s: shapeset){
            System.out.println("s[" + count++ + "]のオブジェクト表示");
            System.out.println(s);
            s.draw();
            System.out.println();
        }
    }
}
