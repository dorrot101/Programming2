// 演習問題1: 図形クラス群の拡張 RgtBtmRAITriangle.java
// 右下が直角であるサブクラスRgtBtmRAITriangle

public class RgtBtmRAITriangle extends RAITriangle{
    public RgtBtmRAITriangle(int length){
        super(length);
    }

    @Override public String toString(){
        return "RgtBtmRAITriangle(length:" + getLength() + ")";
    }

    @Override public void draw(){
        int length = getLength();
        for(int i = 0; i< length; i++){
            for(int j = 0; j < length; j++){
                if( j < length-i) System.out.print(' ');
                else System.out.print('*');
            }
            System.out.println();
        }
    }
}