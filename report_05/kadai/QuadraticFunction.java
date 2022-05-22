// 課題: 関数のクラス階層とインタフェース QuadraticFunction.java

public class QuadraticFunction extends DifferentiableFunction{
    String name;
    double coefficient;
    double constant;

    QuadraticFunction(String name, double coefficient, double constant){
        this.name = name; this.coefficient = coefficient; this.constant = constant;
    }

    @Override
    public void print(){
        if(coefficient == 1) System.out.println(name + ": f(x) = x^2 + " + constant);
        else System.out.println(name + ": f(x) = " + coefficient + "x^2 + " + constant);
    }

    @Override
    public double value(double x){
        return coefficient*Math.pow(x,2) + constant;
    }

    @Override
    public double dValue(double x){
        return 2*coefficient*x;
    }
}