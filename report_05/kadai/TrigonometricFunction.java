// 課題: 関数のクラス階層とインタフェース TrigonometricFunction.java

public class TrigonometricFunction extends DifferentiableFunction{
    String name;
    double constant;

    TrigonometricFunction(String name, double constant){
        this.name = name;
        this.constant = constant;
    }

    @Override 
    public void print(){
        System.out.println(name + ": f(x) = sin x + " + constant);
    };

    @Override
    public double value(double x){
        return (Math.sin(x) + constant);
    };

    @Override
    public double dValue(double x){
        return Math.cos(x);
    }
}