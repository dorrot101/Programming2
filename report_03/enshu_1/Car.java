// 演習問題1 自動車クラスの拡張 Car.java

public class Car{
    private String name;
    private int width;
    private int height;
    private int length;
    private double x;
    private double y;
    private double fuel;
    private Day purchaseDay;

    public Car(String name, int width, int height, int length, double fuel, Day purchaseDay){
        this.name = name;
        this. width = width;
        this.height = height;
        this.length = length;
        this.fuel = fuel;
        this.purchaseDay = new Day(purchaseDay);
    }

    public double getX(){ return x; }
    public double getY(){ return y; }
    public double getFuel(){ return fuel; }

    public Day getPurchaseDay(){
        return new Day(purchaseDay);
    }

    public void putSpec(){
        System.out.println("名前：" + name);
        System.out.println("車幅：" + width + "mm");
        System.out.println("車高：" + height + "mm");
        System.out.println("車長：" + length + "mm");
    }

    public boolean move(double dx, double dy){
        double dist = Math.sqrt(dx*dx + dy*dy);
        if(dist > fuel) return false;
        else{
            fuel -= dist;
            x += dx;
            y += dy;
            return true;
        }
    }

}