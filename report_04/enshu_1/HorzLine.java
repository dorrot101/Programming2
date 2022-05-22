//演習問題1: 図形クラス群の拡張 HorzLine.java

public class HorzLine extends AbstLine{

    public HorzLine(int length) {super(length);}

    @Override public String toString(){
        return "HorzLine(length:" + getLength() + ")";
    }

    @Override public void draw(){
        for (int i = 1; i<= getLength(); i++){
            System.out.print('-');
        }
    }
}