// 演習問題2: じゃんけんクラスの作成 ComputerPlayer.java
// コンピュータプレーヤを表すサブクラスComputerPlayer

import java.util.Random;

public class ComputerPlayer extends JankenPlayer{
    private String name;
    private int hand;

    public ComputerPlayer(String name){
        this.name = name;
    }

    @Override public String getName(){
        return name;
    }

    @Override public void Janken(){
        Random rand = new Random();
        this.hand = rand.nextInt(3);
    }

    @Override public int getHand(){
        return hand;
    }
}