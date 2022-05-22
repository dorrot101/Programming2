// 演習問題1: 図形クラス群の拡張 LftTopRAITriangle.java
// 左上が直角であるサブクラスLftTopRAITriangle

public class LftTopRAITriangle extends RAITriangle{
    public LftTopRAITriangle(int length){
        super(length);
    }

    @Override public String toString(){
        return "LftTopRAITriangle(length:" + getLength() + ")";
    }

    @Override public void draw(){
        int length = getLength();
        for(int i = 0; i< length; i++){
            for(int j = 0; j < length; j++){
                if( j >= length-i) System.out.print(' ');
                else System.out.print('*');
            }
            System.out.println();
        }
    }
}