//課題: 方程式のクラス階層 TrigonometricEquation.java

public class TrigonometricEquation extends Equation{

    private String name;
    private double constant;
    private double solution;
    private double degree;
    
    public TrigonometricEquation(String name, double constant){
        this.name = name;
        this.constant = constant;
    }

    public void print(){
        System.out.printf("eq. %s : sin x - %.1f = 0%n", name, constant);
    }

    public void solve(){
        solution = Math.asin(constant);
        degree = solution*360/(Math.PI*2);

        System.out.printf("x=%f [rad] {%f [deg]}", solution, degree);
    }

    public String getName(){
        return name;
    }
}
