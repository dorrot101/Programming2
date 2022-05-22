// 課題2: 自作の例外クラスを作る RangeAdd.java

public class RangeAdd{
    public static double add(int a, int b) throws NotNaturalNumber{
        if(a<0) throw new NotNaturalNumber(a);
        else if(b<0) throw new NotNaturalNumber(b);
        
        int from = a<b?a:b;
        int to = a<b?b:a;
        double sum = 0;
        for(;from <= to; from++){
            sum += from;
        }
        return (double)sum;
    }
}