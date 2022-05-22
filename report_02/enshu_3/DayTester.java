// 演習問題3: 日付クラスの改良 DayTester.java

public class DayTester{
    public static void main(String[] args){
        Day day0 = new Day();
        Day day1 = new Day(2020,2,28);
        Day day2 = new Day(2021,3,31);

        System.out.println("今日は" + day0 + "です。");
        System.out.println("DAY1は" + day1 + "です。");
        System.out.println("DAY2は" + day2 + "です。" + '\n');

        System.out.println("DAY1,DAY2の前後関係");
        if(day1.isSameday(day2)) System.out.println("Day1とDay2は同じ日です。" + '\n');
        else if(day1.isEarlier(day2)) System.out.println("Day1がDay2より早いです。" + '\n');
        else System.out.println("Day2がDay1より早いです。" + '\n');

        System.out.println("過ぎた日数");
        System.out.println("今日は元旦から" + day0.getPastdays() + "日過ぎました。");
        System.out.println("DAY1は元旦から" + day1.getPastdays() + "日過ぎました。"); 
        System.out.println("DAY2は元旦から" + day2.getPastdays() + "日過ぎました。"+'\n'); 

        System.out.println("残った日数");
        System.out.println("今年は今日から" + day0.getRemaindays() + "日残りました。");
        System.out.println("今年はDAY1から" + day1.getRemaindays() + "日残りました。"); 
        System.out.println("今年はDAY2から" + day2.getRemaindays() + "日残りました。" + '\n'); 

        System.out.println("明日や昨日の日付を求める");
        Day day1a = day1.getDateafter(1);
        System.out.println("DAY1の明日は" + day1a + "です。");
        Day day2b = day2.getDatebefore(1);
        System.out.println("DAY2の昨日は" + day2b + "でした。" + '\n');

        System.out.println("60日前に進める。");
        day1.setDateafter(60);
        System.out.println("DAY1が" + day1 + "になりました。" + '\n'); 

        System.out.println("60日後に戻す。");
        day2.setDatebefore(60);
        System.out.println("DAY2が" + day2 + "になりました。" + '\n');   
        
        System.out.println("不正な値を入れると");
        Day day3 = new Day(2020,13,31);
        Day day4 = new Day(2000,2,30);
        Day day5 = new Day(-1515, 15, 32);

        System.out.println("DAY3 = Day(2020,13,31) : " + day3);   
        System.out.println("DAY4 = Day(2000,2,30) : " + day4);   
        System.out.println("DAY5 = Day(-1515, 15, 32) : " + day5);   
    }
}