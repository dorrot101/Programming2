// 演習2: MinMaxクラスの作成 MinMax.java

public class MinMax{
    //Int Method
    public static int getMin(int a, int b){
        return a>b?b:a;
    }

    public static int getMin(int a, int b, int c){
        int temp = getMin(a,b);
        return getMin(temp,c);
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int getMax(int a, int b){
        return a>b?a:b;
    }

    public static int getMax(int a, int b, int c){
        int temp = getMax(a,b);
        return getMax(temp,c);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    //Double Method
    public static double getMin(double a, double b){
        return a>b?b:a;
    }
    
    public static double getMin(double a, double b, double c){
        double temp = getMin(a,b);
        return getMin(temp,c);
    }
    
    public static double getMin(double[] arr){
        double min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
    
    public static double getMax(double a, double b){
        return a>b?a:b;
    }
    
    public static double getMax(double a, double b, double c){
        double temp = getMax(a,b);
        return getMax(temp,c);
    }
    
    public static double getMax(double[] arr){
        double max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}
