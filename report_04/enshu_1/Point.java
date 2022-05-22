// 演習問題1: 図形クラス群の拡張 Point.java

public class Point extends Shape{
    public Point(){
    }

    @Override public String toString(){
        return "Point";
    }

    @Override public void draw(){
        System.out.println('+');
    }
}
