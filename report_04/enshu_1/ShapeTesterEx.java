// 演習問題1: 図形クラス群の拡張 ShapeTesterEx.java
import java.util.Scanner;

class ShapeTester{

    public static void main(String[] args) {
        int count, length, num;
        Scanner In = new Scanner(System.in);
        
        System.out.print("Number of Case : ");
        count = In.nextInt();
        Shape[] Shapeset = new Shape[count];

        System.out.println("1.Point/ 2.HorizontialLine/ 3. VerticalLine/ 4. Rectangle/" + '\n' + "5. LftTopRAITriangle/ 6. LftBtmRAITriangle/ 7. RgtTopRAITriangle/ 8. RgtBtmRAITriangle");
        System.out.println();

        for(int i =0; i<count; i++){
            do{
                System.out.print("Choose number of case "+(i+1) + " : ");
                num = In.nextInt();
            }while(num<1 || num>8);

            if(num == 1){
                length = 0;
            }else{
                System.out.print("Enter length of case "+(i+1) + " : ");
                length = In.nextInt();
            }
            
            switch(num){
                case 1: Shapeset[i] = new Point(); break;
                case 2: Shapeset[i] = new HorzLine(length); break;
                case 3: Shapeset[i] = new VertLine(length); break;
                case 4: {
                    System.out.print("Enter height of case "+(i+1) + " : ");
                    int height = In.nextInt();
                    Shapeset[i] = new Rectangle(length, height);
                    break;
                }
                case 5: Shapeset[i] = new LftTopRAITriangle(length); break;
                case 6: Shapeset[i] = new LftBtmRAITriangle(length); break;
                case 7: Shapeset[i] = new RgtTopRAITriangle(length); break;
                case 8: Shapeset[i] = new RgtBtmRAITriangle(length); break;
            }
            System.out.println();
        }

        for(Shape s: Shapeset){
            s.print();
            System.out.println();
        }
    }
}