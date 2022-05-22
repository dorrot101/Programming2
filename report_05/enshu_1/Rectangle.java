// 演習問題1: 図形クラス群の拡張2 Rectangle.java

public class Rectangle extends Shape implements Plane2D{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width; this.height = height;
    }

    @Override public String toString(){
        return "Rectangle(width:" + width + ", height:" + height + ")";
    }

    @Override public void draw(){
        for(int i = 1; i <= height; i++){
            for(int j = 1; j<= width; j++) System.out.print('#');
            System.out.println();
        }
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }

    @Override public int getArea(){return width*height;}
    @Override public double getPerimeter(){return 2*(width+height);}
}
