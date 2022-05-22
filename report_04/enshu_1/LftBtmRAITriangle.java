// 演習問題1: 図形クラス群の拡張 LftBtmRAITriangle.java
// 左下が直角であるサブクラスLftBtmRAITriangle

public class LftBtmRAITriangle extends RAITriangle{
    public LftBtmRAITriangle(int length){
        super(length);
    }

    @Override public String toString(){
        return "LftBtmRAITriangle(length:" + getLength() + ")";
    }

    @Override public void draw(){
        int length = getLength();
        for(int i = 0; i< length; i++){
            for(int j = 0; j < length; j++){
                if( j > i) System.out.print(' ');
                else System.out.print('*');
            }
            System.out.println();
        }
    }
}