// 課題: 2～16進数表示に対応した整数クラス BinHexVal.java

public class BinHexVal{

    // Constructor and toString override
    public BinHexVal(int value){
        this.value = value;
    }

    public String toString(){
        int n = value;
        String s = "";
        do{
            int r = n % Base;
            s = r>=10 ? (char) ('A' + r-10) + s : r + s;
            n /= Base;
        } while(n>0); 
       
        return s;
    }

    // Method
    public int getBase(){
        return Base;
    }
    public int getvalue(){
        return value;
    }
    public static void setBase(int target){
        if(Base<2) Base = 2;
        else if(Base>16) Base = 16;
        else Base = target;
    }
    public void setvalue(int value){
        this.value = value;
    }

    private static int Base = 10;
    private int value;
}