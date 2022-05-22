// 課題1: カレー店のランチクラス LunchB.java
// このひな形を利用するか，題意が満たされていれば独自に作成してもよい
public class LunchB extends LunchA{
    private String topping ; // トッピングの名前
    private int pTopping ; // トッピングの価格
	 
    public LunchB(String curry, int pCurry, String topping, int pTopping){
		  super(curry, pCurry);
		  this.topping = topping ;
		  this.pTopping = pTopping ;
    }
	 
    @Override
	 public String name(){
		  return  super.name() + " & " + topping; }

    @Override
    public int price() {
		  return super.price() + pTopping; }

}
