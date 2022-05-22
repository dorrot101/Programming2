// 演習問題2：銀行口座クラスの活用 TimeAccount.java

public class TimeAccount extends Account{
    private long timeBalance;

    public TimeAccount(String n, String num, long z, long timeBalance, Day day){
        super(n, num, z, day);
        this.timeBalance = timeBalance;
    }

    public String toString(){
        return '■'+ getName().substring(0,2) + "君の口座" + '\n' + " 口座名義 : " + getName() + " 口座番号 : " + getNo() + " 普通預金残高 : " + super.getBalance() + " 定期預金残高 : " + getTimeBalance() + getdayinfo()+ '\n';
    }

    @Override
    public long getBalance(){
        return super.getBalance() + timeBalance;
    }

    public long getTimeBalance(){
        return timeBalance;
    }
    


}