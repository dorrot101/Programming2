//演習問題1: 図形クラス群の拡張 AbstLine.java

public abstract class AbstLine extends Shape{
    private int length;

    public AbstLine(int length){
        setLength(length);
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    @Override public String toString(){
        return "AbstLine(length:" + length + ")";
    }
}