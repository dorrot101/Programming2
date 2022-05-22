// 演習2: MinMaxクラスの作成 MinMaxTester.java

import java.util.Scanner;

public class MinMaxTester{
    public static void main(String[] args){
        //Set Range
        int Integerpart = 100;
        double decimalpart = 1000.0;
        int size = 50;

        //Randomzie Values
        int a = (int) (Math.random()*Integerpart);
        int b = (int) (Math.random()*Integerpart);
        int c = (int) (Math.random()*Integerpart);
        int d = (int) (Math.random()*Integerpart);
        int e = (int) (Math.random()*Integerpart);

        //Randomzie Values and Limit to three decimal places
        double da = Math.round(Math.random()*Integerpart*decimalpart)/decimalpart;
        double db = Math.round(Math.random()*Integerpart*decimalpart)/decimalpart;
        double dc = Math.round(Math.random()*Integerpart*decimalpart)/decimalpart;
        double dd = Math.round(Math.random()*Integerpart*decimalpart)/decimalpart;
        double de = Math.round(Math.random()*Integerpart*decimalpart)/decimalpart;

        int[] Intarr = new int[size];
        for(int i = 0; i<size; i++){
            Intarr[i] = (int) (Math.random()*Integerpart);
        }

        double[] Doublearr = new double[size];
        for(int i = 0; i<size; i++){
            Doublearr[i] = Math.round(Math.random()*Integerpart*decimalpart)/decimalpart;
        }

        //Print MinMax of 2 int Values
        System.out.println("[" + a + ", " + b + "]");
        System.out.println("MaxValue is : " + MinMax.getMax(a,b));
        System.out.println("MinValue is : " + MinMax.getMin(a,b));

        //Print MinMax of 3 int Values
        System.out.println("[" + c + ", " + d + ", " + e + "]");
        System.out.println("MaxValue is : " + MinMax.getMax(c,d,e));
        System.out.println("MinValue is : " + MinMax.getMin(c,d,e));

        //Print MinMax of int Array
        System.out.print("[");
        for(int i = 0; i<Intarr.length-1; i++){
            System.out.print(Intarr[i] + ", ");
        }
        System.out.println(Intarr[Intarr.length-1]+"]");
        System.out.println("MaxValue is : " + MinMax.getMax(Intarr));
        System.out.println("MinValue is : " + MinMax.getMin(Intarr));

        //Print MinMax of 2 double Values
        System.out.println("[" + da + ", " + db + "]");
        System.out.println("MaxValue is : " + MinMax.getMax(da,db));
        System.out.println("MinValue is : " + MinMax.getMin(da,db));

        //Print MinMax of 3 double Values
        System.out.println("[" + dc + ", " + dd + ", " + de + "]");
        System.out.println("MaxValue is : " + MinMax.getMax(dc,dd,de));
        System.out.println("MinValue is : " + MinMax.getMin(dc,dd,de));

        //Print MinMax of double Array
        System.out.print("[");
        for(int i = 0; i<Doublearr.length-1; i++){
            System.out.print(Doublearr[i] + ", ");
        }
        System.out.println(Doublearr[Doublearr.length-1]+"]");
        System.out.println("MaxValue is : " + MinMax.getMax(Doublearr));
        System.out.println("MinValue is : " + MinMax.getMin(Doublearr));
    }
}