// 2～16進数表示に対応した整数クラス BinHexValTester.java

public class BinHexValTester{
    public static void main(String[] args){
        BinHexVal[] valarray = new BinHexVal[4];
        
        // 32bit signed int max value
        valarray[0] = new BinHexVal(2147483647);
        valarray[1] = new BinHexVal(2147483647+1);
        valarray[2] = new BinHexVal(11184810);
        valarray[3] = new BinHexVal(22369621);

        System.out.println("Convert to binary");
        BinHexVal.setBase(2);
        for(int i = 0; i<4; i++){
            System.out.println(valarray[i]);
        }
        
        System.out.println("Convert to octal" );
        BinHexVal.setBase(8);
        for(int i = 0; i<4; i++){
            System.out.println(valarray[i]);
        }
        
        System.out.println("Convert to decimal");
        BinHexVal.setBase(10);
        for(int i = 0; i<4; i++){
            System.out.println(valarray[i]);
        }

        System.out.println("Convert to hexadecimal");
        BinHexVal.setBase(16);
        for(int i = 0; i<4; i++){
            System.out.println(valarray[i]);
        }
    }
}