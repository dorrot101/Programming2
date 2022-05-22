// 課題1: カレー店のランチクラス LunchA.java
// このひな形を利用し???を適切なコードに修正するか，題意が満たされていれば独自に作成してもよい
public class LunchA{
    private static int count = 0; // 注文数
	 
    private int order; // 注文番号
    private String curry; // カレーの料理名
    private int pCurry; // カレーの価格
	 
    public LunchA(String curry, int pCurry){
		  order = ++count;
		  this.curry = curry;
		  this.pCurry = pCurry;
    }
    
    public String name() { return curry; }
    public int price() { return pCurry; }
	 
    public void print(){
		  System.out.println("Order: " + order);
		  System.out.println("Menu: " + name());
		  System.out.println("Price: " +  price());
    }
}
