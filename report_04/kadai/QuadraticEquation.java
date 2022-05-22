import java.lang.reflect.Constructor;

//課題: 方程式のクラス階層 QuadraticEquation.java

public class QuadraticEquation extends Equation{

    private String name;
    private double coefficient_a;
    private double coefficient_b;
    private double constant;

    public QuadraticEquation(String name, double coefficient_a, double coefficient_b, double constant){
        this.name = name;
        if(coefficient_a <= 0) this.coefficient_a = 1;
        else this.coefficient_a = coefficient_a;
        this.coefficient_b = coefficient_b;
        this.constant = constant;
    }

    public void print(){
        if(coefficient_a == 1.0){
            System.out.printf("eq. %s : x^2 + ", name);
            if(coefficient_b == 0.0){
                System.out.printf("%.1f %n", constant);
            }else System.out.printf("%.1fx + %.1f %n", coefficient_b,constant);
        }else{
            System.out.printf("eq. %s : %.1fx^2 + ", name, coefficient_a);
            if(coefficient_b == 0.0){
                System.out.printf("%.1f %n", constant);
            }else System.out.printf("%.1fx + %.1f %n", coefficient_b,constant);
        }
    }

    public void solve(){
        double judgement;
        double SolutionA;
        double SolutionB;
        double realNum;
        double imaginaryNum;

        judgement = Math.pow(coefficient_b,2)-4*coefficient_a*constant;

        if(judgement>=0){
            SolutionA = (-coefficient_b + Math.sqrt(judgement))/(2*coefficient_a);
            SolutionB = (-coefficient_b - Math.sqrt(judgement))/(2*coefficient_a);

            if(judgement > 0)  System.out.printf("x=%.3f, x=%.3f %n", SolutionA, SolutionB);
            else System.out.printf("x=%.3f %n", SolutionA);
        }else{
            imaginaryNum = Math.sqrt(-judgement)/(2*coefficient_a);
            realNum = (-coefficient_b)/(2*coefficient_a);

            System.out.printf("x=%.3f+%.3fi, x=%.3f-%.3fi %n", realNum, imaginaryNum, realNum, imaginaryNum);
        }
    }

    public String getName(){
        return name;
    }
}