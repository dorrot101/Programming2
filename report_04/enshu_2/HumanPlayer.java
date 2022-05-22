// 演習問題2: じゃんけんクラスの作成 HumanPlayer.java
// 人間プレーヤを表すサブクラスHumanPlayer
import java.util.Scanner;


public class HumanPlayer extends JankenPlayer{
    private String name;  
    private int hand;
    Scanner In = new Scanner(System.in);

    HumanPlayer(String name){
        this.name = name;
    }

    @Override public String getName(){
        return name;
    }

    @Override public void Janken(){
        do{       
            System.out.print("ジャンケン");
            for(int i = 0; i<3; i++){
                System.out.printf("(%d)%s", i, JankenGame.hands[i]);
            }
            System.out.print(":");
            this.hand = In.nextInt();           
        }while(hand< 0 || hand > 2);
    }

    @Override public int getHand(){
        return hand;
    }
}