// 演習問題2: Battleゲームの拡張 Enemy.java
import java.util.Random;

public class Enemy extends Character{
	private Random rnd;
	 // コンストラクタ
	 Enemy(String name, int hp, int ap){
		super(name, hp, ap);
		rnd = new Random();
	}

	 public void attack(Hero target){
		if(rnd.nextInt(6) == 1){ // 0～5の乱数を生成（確率は調整してよい)
			System.out.println(name + " が " + target.getName() + " の急所を打撃!!");
			target.damage( (int) (1.5 * ap));
		}
	  else{ // 普通の攻撃
			System.out.println(name + " が " + target.getName() + " に襲い掛かる!!");
			target.damage(ap);
	  	}

	}
		  
	 public void damage(int dp){
		if( rnd.nextInt(10) == 1){ // 0～9の乱数を生成（確率は調整してよい）
			System.out.println(name + " は攻撃をかわした!!");
	  	}
	  	else{
			System.out.println(name + " は " + dp + " のダメージを受けた!!");
			hp -= dp; // 攻撃力分をhpから減算
			if(hp < 0) hp = 0;
	  	}
	}
}
