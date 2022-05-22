// 演習問題1 自動車クラスの拡張 OdometerCar.java

public class OdometerCar extends Car{

    private double mileage = 0.0; 
    private double x = 0.0;
    private double y = 0.0;
    private double fuel = 0.0;

    OdometerCar(String name, int width, int height, int length, double fuel, Day purchaseDay){
        super(name, width, height, length, fuel, purchaseDay);  
        this.fuel = fuel;    
    }

    @Override
    public void putSpec(){
        super.putSpec();
        System.out.println("製造日：" + getPurchaseDay());
    }

    public void ShowLocation(){
        System.out.printf("%s [%.2f, %.2f] %n","Current Location : ", x,y);
        System.out.printf("%s %.3f %n", "Current mileage : ", mileage);
        System.out.printf("%s %.3f %n", "Left Fuel : ", fuel);
    }

    public double getMileage(){
        return mileage;
    }

    private void setMileage(double distance){
        this.mileage += distance;
    }

    public double getFuel(){
        return fuel;
    }

    @Override
    public boolean move(double dx, double dy){
        double dist = Math.sqrt(dx*dx + dy*dy);
        if(dist > fuel) return false;
        else{
            fuel -= dist;
            x += dx;
            y += dy;         
            setMileage(dist);
            return true;
        }
    }

    
}
