// 演習問題1 自動車クラスの拡張 OdometerCarTester.java
import java.util.Scanner;

public class OdometerCarTester{
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        double x = 0, y = 0;
        OdometerCar test1 = new OdometerCar("BEATLE", 1724, 1498, 4081, 55, new Day(2003,06,17));
        test1.putSpec();
        System.out.printf("%s %.3f %n", "Current mileage : ", test1.getMileage());
        test1.ShowLocation();
        while(true){
            System.out.print("X-direction distance : ");
            x = In.nextDouble();
            System.out.print("Y-direction distance : ");
            y = In.nextDouble();
            if(test1.move(x,y)) test1.ShowLocation();
            else {
                double temp = Math.sqrt(test1.getFuel()*test1.getFuel()/2);
                System.out.printf("%s %.3f %n", "You could only go this distance further : ", test1.getFuel());
                test1.move(temp, temp);
                test1.ShowLocation();
                System.out.println("There's no Fuel");
                break;
            }
        }
    }
}
