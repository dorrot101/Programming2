// 演習問題1: 図形クラス群の拡張 RgtTopRAITriangle.java
// 右上が直角であるサブクラスRgtTopRAITriangle

public class RgtTopRAITriangle extends RAITriangle{
    public RgtTopRAITriangle(int length){
        super(length);
    }

    @Override public String toString(){
        return "RgtTopRAITriangle(length:" + getLength() + ")";
    }

    @Override public void draw(){
        int length = getLength();
        for(int i = 0; i<length; i++){
            for(int j = 0; j < length; j++){
                if(j < i) System.out.print(' ');
                else System.out.print('*');
            }
            System.out.println();
        }
    }
}