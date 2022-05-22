// 課題: 関数のクラス階層とインタフェース FunctionTester.java

public class FunctionTester{
    public static double NewtonMethod(DifferentiableFunction f, double x0, int n){
        double x = x0;
        for(int i = 1; i <= n; i++){
            x = x - f.value(x)/f.dValue(x);
        }
        return x;
    }

    public static void main(String[] args) {
        DifferentiableFunction[] difFuncs = new DifferentiableFunction[4];
        difFuncs[0] = new QuadraticFunction("A1", 1, -1);
        difFuncs[1] = new QuadraticFunction("A2", 1, -2);
        difFuncs[2] = new TrigonometricFunction("B1", 1);
        difFuncs[3] = new TrigonometricFunction("B2", 0.5);

        System.out.println("式の確認");
        for(Function f: difFuncs) {
            f.print(); 
            System.out.println("f.value = " + f.value(0));
        }
        System.out.println();

        System.out.println("微分値の確認");
        for(Differentiable d: difFuncs) {
            DifferentiableFunction df = (DifferentiableFunction) d;
            if(df instanceof Differentiable) df.print();
            System.out.println("d.value = " + d.dValue(0));
        }
        System.out.println();
        
        System.out.println("近似解の確認");
        for(DifferentiableFunction df: difFuncs) {
            double Newtonsolution = NewtonMethod(df, 1, 30);
            df.print();
            System.out.println("近似解 : " + Newtonsolution);
            System.out.println("検算 = f(" + Newtonsolution + ") = " + df.value(Newtonsolution));
        }
        System.out.println();

        System.out.println("ニュートン法の確認");
        double x = 1;
        DifferentiableFunction df = difFuncs[2];
        df.print();
        for(int i = 1; i<=30; i++){
            x = x - (df.value(x)/df.dValue(x));
            System.out.printf("N=%d, 近似解=%f (解析解との差=%f)",i, x, (x - Math.asin(-1))); 
            System.out.println();
        }

    }
}