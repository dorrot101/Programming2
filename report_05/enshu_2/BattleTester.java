// 演習問題2: Battleゲームの拡張 BattleTester.java
import java.util.Scanner;

public class BattleTester {
	 public static void main(String[] args) {
		Scanner In = new Scanner(System.in);

		  Hero au = new Hero("Kazuma", 200, 120);
		  Enemy monster = new Enemy("モンスター", 600, 50);
		  int turn = 0;
		  
		  //ステータスを表示
		  while(true){
				System.out.println( "\n" + ++turn + "ターン目");
				au.putStatus();
				monster.putStatus();

				// 攻撃開始
				if( au.getHp() > 0){
					int option;
					do{
						System.out.print(au.getName() + "'s turn : " + '\n'  + "[0] attack [1] fireball : ");
						option = In.nextInt();
					}while(option < 0 || option >1);
					
					if(option == 0) au.attack(monster);
					else au.fire(monster);
				}
				else{
					System.out.println( au.getName() + " は死んでしまった..");
					break;
				}
				
				if( monster.getHp() > 0){
					System.out.print(monster.getName() + "'s turn : " + '\n');
					monster.attack(au);
				}
				else{
					System.out.println( au.getName() + " は " + monster.getName()  + " を倒した!!");
					break;
				}
		  }
	 }
}
