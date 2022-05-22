// 演習問題1: 図形クラス群の拡張 RAITriangle.java

public abstract class RAITriangle extends Shape{
    private int length;

    public RAITriangle(int length){
        setLength(length);
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    @Override public String toString(){
        return "RAITriangle(length:" + length + ")";
    }
}