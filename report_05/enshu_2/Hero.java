// 演習問題2: Battleゲームの改良 Hero.java
import java.util.Random;

public class Hero extends Character implements Fighter, Wizard{
	 
	 private Random rnd;

	 // コンストラクタ
	 Hero(String name, int hp, int ap){
		  	super(name, hp, ap);
		  	rnd = new Random();  // 乱数生成用のインスタンスを初期化
		}
	 

	 @Override
	 public void attack(Enemy target){
		if( rnd.nextInt(3) == 1){ // 0～2の乱数を生成（確率は調整してよい)
			System.out.println(name + " が " + target.getName() + " の急所を打撃!!");
			target.damage((int) (1.7 * ap));
		}
		else{ // 普通の攻撃
			System.out.println(name + " が " + target.getName() + " を打撃!!");
			target.damage((int) (1.2 * ap));
		}
	}

	 @Override 
	 public void fire(Enemy target){
		if( rnd.nextInt(3) == 1){ // 0～2の乱数を生成（確率は調整してよい)
			System.out.println(name + " が " + target.getName() + " の急所にファイアウォール!!");
			target.damage((int) (2 * ap));
	  	}
	  	else{ // 普通の攻撃
			System.out.println(name + " が " + target.getName() + " にファイアウォール!!");
			target.damage((int) (0.8 * ap));
	  	}
	}
	 
	 
	 public void damage(int dp){
		if( rnd.nextInt(5) == 1){ // 0～4の乱数を生成（確率は調整してよい）
			System.out.println(name + " は攻撃をかわした!!");
		}
		else{
			System.out.println(name + " は " + dp + " のダメージを受けた!!");
			hp -= dp; // 攻撃力分をhpから減算
			if(hp < 0) hp = 0;
		}
	}

	
}
