// 演習問題1: 図形クラス群の拡張 Shape.java

public abstract class Shape{

    public abstract String toString();

    public abstract void draw();

    public void print(){
        System.out.println(toString());
        draw();
    }
}