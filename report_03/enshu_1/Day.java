// 演習問題1 自動車クラスの拡張 Day.java

public class Day{
    private int year = 1;
    private int month = 1;
    private int date = 1;

    Day() {}
     
    Day(int year) { this.year = year; }

    Day(int year, int month) { this(year); this.month = month; }

    Day(int year, int month, int date){ this(year, month); this.date = date; }

    Day(Day d) {this(d.year, d.month, d.date);}

    public String toString(){
        String[] wd = {"日","月","火","水","木","金","土"};
        return String.format("%04d年%02d月%02d日(%s)",year, month, date, wd[dayOfWeek()]);
        
    } 

    void set(int year, int month, int date){
        this.year = year;
        this.month = month;
        this.date = date;
    }

    int dayOfWeek(){
        int y = year;
        int m = month;
        if (m == 1 || m == 2){
            y--;
            m += 12;
        }
        return (y + y/4 - y/100 + y/400 + (13*m + 8)/5 + date)%7;
    }

    public boolean equalTo(Day d){
        return year == d.year && month == d.month && date == d.date;
    }

    public static boolean isLeap(int y){
        return y%4 == 0 && y%100 != 0 || y%400 == 0;
    }

    public boolean isLeap() { return isLeap(year); }


    int getYear() { return year; }
    int getMonth() { return month; }
    int getDate() { return date; }

    void setYear(int year) { this.year = year; }
    void setMonth(int month) { this.month = month; }
    void setDate(int date) { this.date = date; }
}
