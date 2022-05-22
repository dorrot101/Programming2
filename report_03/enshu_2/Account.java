// 演習問題2：銀行口座クラスの活用 Account.java

public class Account{
    private static int counter = 0;

    private String name;
    private String no;
    private long balance;
    private int id;
    private final Day dayinfo;

    public Account(String n, String num, long z, Day day){
        name = n;
        no = num;
        balance = z;
        dayinfo = new Day(day);
        id = ++counter;
    }

    public Account(String n, String num, long z, int year, int month, int day){
        name = n;
        no = num;
        balance = z;
        dayinfo = new Day(year, month ,day);
        id = ++counter;
    }

    void deposit(long k){ balance += k; }

    void withdraw(long k){ balance -= k; }

    public int getId(){ return id; }

    String getName(){ return name; }

    String getNo(){ return no; }
    
    long getBalance(){ return balance; }

    public String getdayinfo(){
        return " 口座開設日 : "+ dayinfo.getYear() + "年" + dayinfo.getMonth() + "月" + dayinfo.getDate() + "日";
    }

    public String toString(){
        return '■'+ name.substring(0,2) + "君の口座" + '\n' + " 口座名義 : " + name + " 口座番号 : " + no + " 預金残高 : " + balance + getdayinfo()+ '\n';
    }
}

