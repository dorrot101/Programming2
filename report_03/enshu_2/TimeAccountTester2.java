// 演習問題2：銀行口座クラスの活用 TimeAccountTester2.java

import java.util.Scanner;

public class TimeAccountTester2{

    public static int compBalance(Account t1, Account t2){
        int isRicher = 0;
        if(t1.getBalance() == t2.getBalance()){
            isRicher = 0;
        } else isRicher = t1.getBalance() > t2.getBalance() ? 1 : -1;
        
        return isRicher;
    }
    public static void main(String[] args) {        

        Account[] Acc_Array = new Account[2];
       
        // CALL BOTH OF CONSTRUCTOR Account(...,Day d) AND Account(...,int, int, int)
        Day day = new Day(2020, 10, 22);

        Acc_Array[0] = new Account("足立幸一", "123456", 300, 1999, 10, 22);
        Acc_Array[1] = new TimeAccount("仲田真二", "654321", 300, 800, day);

        for(int i = 0; i<2; i++){
            System.out.println(Acc_Array[i]);
        }

        System.out.println("確認1：足立君と仲田君の口座情報を比較　compBalance(adachi, nakata)");
        switch(compBalance(Acc_Array[0], Acc_Array[1])){
            case 0: System.out.println(Acc_Array[0].getName().substring(0,2) + "君と" + Acc_Array[1].getName().substring(0,2) + "君の預金残高は同じ" ); break;
            case 1: System.out.println(Acc_Array[0].getName().substring(0,2) + "君の方が預金残高が多い" ); break;
            case -1: System.out.println(Acc_Array[1].getName().substring(0,2) + "君の方が預金残高が多い"); break;
        }

        System.out.println('\n' + "確認2：仲田君と足立君の口座情報を比較 compBalance(nakata, adachi)");
        switch(compBalance(Acc_Array[1], Acc_Array[0])){
            case 0: System.out.println(Acc_Array[1].getName().substring(0,2) + "君と" + Acc_Array[0].getName().substring(0,2) + "君の預金残高は同じ" ); break;
            case 1: System.out.println(Acc_Array[1].getName().substring(0,2) + "君の方が預金残高が多い" ); break;
            case -1: System.out.println(Acc_Array[0].getName().substring(0,2) + "君の方が預金残高が多い"); break;
        }

        System.out.println('\n' + "確認3：足立君と足立君の口座情報を比較 compBalance(adachi, adachi)");
        switch(compBalance(Acc_Array[0], Acc_Array[0])){
            case 0: System.out.println("同じ"); break;
            case 1: System.out.println(Acc_Array[0].getName().substring(0,2) + "君の方が預金残高が多い" ); break;
            case -1: System.out.println(Acc_Array[0].getName().substring(0,2) + "君の方が預金残高が多い"); break;
        }
    
    }
}