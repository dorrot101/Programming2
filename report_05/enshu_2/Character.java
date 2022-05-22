// 演習問題2: Battleゲームの改良 Character.java
public abstract class Character {
	 protected String name; //名前
	 protected int hp; //体力
	 protected int ap; //攻撃力
	 
	 Character(String name, int hp, int ap){
		  this.name = name;
		  this.hp = hp;
		  this.ap = ap;
	 }
	 //targetに攻撃する (抽象メソッド)
	 public abstract void attack(Character target);

	 //攻撃を受けたときの処理（抽象メソッド）
	 public abstract void damage(int dp);
	 
	 // 状態を表示
	 public void putStatus(){
		  System.out.println( "  " + name + " (hp:" + hp + ")");
	 }
	 
	 public String getName(){
		  return name;
	 }

	 public int getHp(){
		  return hp;
	 }
	 
	 public int getAp(){
		  return ap;
	 }
}
