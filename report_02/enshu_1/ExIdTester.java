// 演習1: クラスIdの拡張 ExIdTester.java

class Id{
    private static int counter = 0;
    private static int step = 1;
    private int id;
    
    public Id(){
        counter += step;
        id = counter;
    }
    //Instance Method
    public int getId(){
        return id;
    }
    //Class Method
    public static int getMaxId(){
        return counter;
    }
    //Class Method
    public static void setstep(int n){
        step = n;
    }
    //Class Method
    public static int getstep(){
        return step;
    }
}

public class ExIdTester{
    public static void main(String[] args){
        //Check Id when step is 1
        System.out.println("現在の増分値："+ Id.getstep());
        Id a = new Id();
        Id b = new Id();
        Id c = new Id();
        System.out.println("aの識別番号：" + a.getId());
        System.out.println("bの識別番号：" + b.getId());
        System.out.println("cの識別番号：" + c.getId());
        //Check Id when step is 3
        Id.setstep(3);
        System.out.println('\n'+"現在の増分値："+ Id.getstep());
        Id d = new Id();
        Id e = new Id();
        Id f = new Id();
        System.out.println("dの識別番号：" + d.getId());
        System.out.println("eの識別番号：" + e.getId());
        System.out.println("fの識別番号：" + f.getId());
        //Check MaxId
        System.out.println('\n'+"EXID.counter = " + Id.getMaxId());
        System.out.println("a.counter = " + a.getMaxId());
        System.out.println("b.counter = " + b.getMaxId());
    }
}