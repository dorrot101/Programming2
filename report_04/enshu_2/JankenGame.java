// 演習問題2: じゃんけんクラスの作成 JankenGame.java
// mainメソッドを含むJankenGameクラス
import java.util.Scanner;

public class JankenGame{

    public static String[] hands = {"グー", "チョキ", "パー"};

    public static void main(String[] args) {
        
        Scanner In = new Scanner(System.in);
        String pName;
        int retry;
        int judge;

        System.out.print("名前：");
        pName = In.next();

        HumanPlayer hPlayer = new HumanPlayer(pName);
        ComputerPlayer cPlayer = new ComputerPlayer("Com1");

        do{
        retry = 0;
        hPlayer.Janken();
        cPlayer.Janken();

        System.out.printf("%sは%sで、%sは%sです。%n", hPlayer.getName(), hands[hPlayer.getHand()], cPlayer.getName(), hands[cPlayer.getHand()]);

        judge = (hPlayer.getHand() - cPlayer.getHand() + 3) % 3;
        switch(judge){
            case 0: {
                System.out.println("引き分けです。");
                retry = 1;
                break;
            }
            case 1: System.out.println(cPlayer.getName()+ "の勝ちです。"); break;
            case 2: System.out.println(hPlayer.getName()+ "の勝ちです。"); break;
        }
        }while(retry == 1);
    }
}
