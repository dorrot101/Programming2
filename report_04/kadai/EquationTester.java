//課題: 方程式のクラス階層 EquationTester.java

public class EquationTester{
    public static void main(String[] args) {
        Equation[] Equations = new Equation[5];

        Equations[0] = new LinearEquation("A", 1, 3.5);
        Equations[1] = new QuadraticEquation("B1", 5, 10, 4);
        Equations[2] = new QuadraticEquation("B2", 1, 4, 4);
        Equations[3] = new QuadraticEquation("B3", 4, 0, 4);
        Equations[4] = new TrigonometricEquation("C", 1);

        for(Equation s: Equations){
            s.print();
            s.solve();
        }
    }
}
