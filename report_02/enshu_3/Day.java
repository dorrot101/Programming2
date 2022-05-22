// 演習問題3: 日付クラスの改良 Day.java
import java.util.Calendar;

public class Day{

    public Day(){
        Calendar cal = Calendar.getInstance();
        this.year = cal.get(Calendar.YEAR);
        this.month = cal.get(Calendar.MONTH)+1;
        this.day = cal.get(Calendar.DATE);
        this.weekday = cal.get(Calendar.DAY_OF_WEEK)-1;
    }

    public Day(int year, int month, int day){
        if(year<1) this.year = 1;
        else this.year = year;

        if(month>12) this.month = 12;
        else if(month<1) this.month = 1;
        else this.month = month;

        if(!isLeapyear(year) && month == 2 && day>28) this.day = 28;
        else if (isLeapyear(year) && month == 2 && day>29) this.day = 29;
        else if(has30th && day>30) this.day = 30;
        else if(day>31) this.day = 31;
        else if(day<1) this.day = 1;
        else this.day = day;

        this.weekday = getWeekday(this.year, this.month, this.day);
    }

    public String toString(){
        return year+"年"+month+"月"+day+"日"+'('+weekdayset[weekday]+')';
    }

    public boolean isEarlier(Day day){
        if(this.year<day.year) return true;
        else if(this.year>day.year) return false;
        else if(this.month<day.month) return true;
        else if(this.month>day.month) return false;
        else if(this.day < day.day) return true;
        else if(this.day > day.day) return false;  
        else return true;  
    }

    public boolean isSameday(Day day){
        return this.year == day.year && this.month == day.month && this.day == day.day;
    }

    public int getPastdays(){
        int year = this.year;
        int month = this.month;
        int day = this.day;
        int sum = 0;
        if(isLeapyear(year) && month>2){
            for(int i = 0; i<month-1; i++){
                sum += dayset[i];
            }
            sum += (day + 1);
        }
        else{
            for(int i = 0; i<month-1; i++){
                sum += dayset[i];
            }
            sum += day;
        }
        return sum;
    }

    public int getRemaindays(){
        int year = this.year;
        int pastdays = getPastdays();
        return isLeapyear(year)?(366-pastdays):(365-pastdays);
    }

    public void setDateafter(int n){
        this.day += n;
        if(isLeapyear(this.year) && this.month == 2 && this.day == 29) ;
        else {
            while(dayset[this.month-1]<this.day){
            if(this.month == 2 && isLeapyear(this.year))
            this.day -= (dayset[this.month-1] + 1);
            else this.day -= dayset[this.month-1];
            if(this.month == 12) {
                ++this.year;
                this.month = 1;
            }else ++this.month;
            }
        }
        this.weekday = getWeekday(this.year, this.month, this.day);
    }

    public Day getDateafter(int n){
        int tyear = this.year;
        int tmonth = this.month;
        int tday = this.day;
        int tweekday = this.weekday;
        tday += n;
        if(isLeapyear(tyear) && tmonth == 2 && tday == 29) ;
        else {
            while(dayset[tmonth-1]<tday){
            if(tmonth == 2 && isLeapyear(tyear))
            tday -= (dayset[tmonth-1] + 1);
            else tday -= dayset[tmonth-1];
            if(tmonth == 12) {
                ++tyear;
                tmonth = 1;
            }else ++tmonth;
            }
        }
        tweekday = getWeekday(tyear, tmonth, tday);
        
        return new Day(tyear, tmonth, tday);
    }

    public void setDatebefore(int n){
        this.day -= n;
        while(this.day<=0){
            int temp = this.month - 1;
            if(this.month == 3 && isLeapyear(this.year))
            this.day += (dayset[(this.month-2)] + 1);
            else if(temp == 0) this.day += dayset[11];
            else this.day += dayset[this.month-2];
            if(this.month == 1) {
                --this.year;
                this.month = 12;
            }else --this.month;
        }
        this.weekday = getWeekday(this.year, this.month, this.day);
    }

    public Day getDatebefore(int n){
        int tyear = this.year;
        int tmonth = this.month;
        int tday = this.day;
        int tweekday = this.weekday;
        tday -= n;
        while(tday<=0){
            int temp = tmonth - 1;
            if(tmonth == 3 && isLeapyear(tyear))
            tday += (dayset[(tmonth-2)] + 1);
            else if(temp == 0) tday += dayset[11];
            else tday += dayset[tmonth-2];
            if(tmonth == 1) {
                --tyear;
                tmonth = 12;
            }else --tmonth;
        }
        return new Day(tyear, tmonth, tday);
    }

    public boolean isLeapyear(int year){
        return year%4 == 0 && year%100 != 0 || year%400 == 0;
    }

    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public char getWeekday(){
        return weekdayset[weekday];
    }

    private int getDoomsday(int year){
        int part1 = (year%100)/12;
        int part2 = (year%100)%12;
        int part3 = part2/4;
        int part4 = anchordayset[(Math.abs(year-1800)/100)%4];
        return ((part1+part2+part3+part4)%7);
    }

    private int getWeekday(int year, int month, int day){
        int week;
        int temp = getDoomsday(year);
        if(isLeapyear(year)) {
            week = Math.abs(leap_doomsdayset[month-1] - day) % 7;
            if(leap_doomsdayset[month-1]>day) return (temp-week+7)%7; 
            else return (temp+week)%7;
        }
        else {
            week = Math.abs(doomsdayset[month-1] - day)%7;
            if(doomsdayset[month-1]>day) return (temp-week+7)%7;
            return (temp+week)%7;
        }
    }

    private int year;
    private int month;
    private int day;
    private int weekday;
    private boolean has30th = month == 4 || month == 6 || month == 9 || month == 11; 

    private int[] doomsdayset = {3,28,14,4,9,6,11,8,5,10,7,12};
    private int[] leap_doomsdayset = {4,29,14,4,9,6,11,8,5,10,7,12};
    private int[] anchordayset = {5,3,2,0};

    private static int[] dayset = {31,28,31,30,31,30,31,31,30,31,30,31};

    private char[] weekdayset = {'日','月','火','水','木','金','土'};
}