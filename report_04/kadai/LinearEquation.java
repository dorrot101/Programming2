//課題: 方程式のクラス階層 LinearEquation.java

public class LinearEquation extends Equation{
    private String name;
    private double coefficient;
    private double constant;
    private double solution;

    public LinearEquation(String name, double coefficient, double constant){
        this.name = name;
        if(coefficient <= 0) this.coefficient = 1;
        this.coefficient = coefficient;
        this.constant = constant;
    }

    public void print(){
        if(coefficient == 1){
            System.out.printf("eq. %s : x + %.1f %n", name, constant);
        }else{
            System.out.printf("eq. %s : %.1fx + %.1f %n", name, coefficient, constant);
        }
    }

    public void solve(){
        solution = constant/coefficient;
        System.out.printf("x=%.3f %n", solution);
    }

    public String getName(){
        return name;
    }
}
