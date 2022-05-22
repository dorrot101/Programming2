// 演習3: カレンダー表示 MyCalendar.java
// 以下に必要な記述を追加せよ
// カレンダーの表示形式には様々なものが考えられるが
// 代表的なものは以下のものが想定される
//
//       2018. 5
// Su Mo Tu We Th Fr Sa
//        1  2  3  4  5
//  6  7  8  9 10 11 12
// 13 14 15 16 17 18 19
// 20 21 22 23 24 25 26
// 27 28 29 30
import java.util.Calendar;

public class MyCalendar{

    public static int[] MaxDateset = {31,28,31,30,31,30,31,31,30,31,30,31}; 
    

    // 必要であれば曜日を求めるこのメソッドを使用しても良い
    // ツェラーの公式による曜日の計算
    // [明解 Java,  p.322 より]
    public static int dayOfWeek(int y, int m, int d){
	if (m == 1 || m == 2){
	    y--;
	    m += 12;
	}
	return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8 ) / 5 + d) % 7;
    }


    public static void PrintCalendar(){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int MaxDate = 0;
        

        System.out.printf("%10d.%2d%n",year,month);
        System.out.printf("%s %s %s %s %s %s %s%n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
        
        int firstDay = dayOfWeek(year, month, 1);
        for(int i = 0; i<firstDay; i++){
            System.out.printf("   ");
        }

        if((year%4 == 0 &&  year%100 != 0 || year%400 == 0) && month == 2) MaxDate = MaxDateset[1] + 1;
        else MaxDate = MaxDateset[month-1];

        for(int day = 1; day <= MaxDate; day++){
            if(dayOfWeek(year, month, day) % 7 == 0){
                System.out.printf("%n%2d ", day);
            }else System.out.printf("%2d ", day);      
        }

        System.out.println();
    }


    // 与えられた年のカレンダーを出力する。
    public static void PrintCalendarYear(int year){
        int MaxDate = 0;
        
        for(int month = 1; month <= 12; month++){
            System.out.printf("%10d.%2d%n",year,month);
            System.out.printf("%s %s %s %s %s %s %s%n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");

            int firstDay = dayOfWeek(year, month, 1);
            for(int i = 0; i<firstDay; i++){
                System.out.printf("   ");
            }

            if((year%4 == 0 && year%100 != 0 || year%400 == 0) && month == 2) MaxDate = (MaxDateset[1] + 1);
            else MaxDate = MaxDateset[month-1];

            for(int day = 1; day <= MaxDate; day++){
                if(dayOfWeek(year, month, day) % 7 == 0){
                    System.out.printf("%n%2d ", day);
                }else System.out.printf("%2d ", day);
                
            }
            System.out.println('\n');
        }
    }
    
    public static void PrintCalendarMonth(int year, int month){
        int MaxDate = 0;

        System.out.printf("%10d.%2d%n",year,month);
        System.out.printf("%s %s %s %s %s %s %s%n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
        
        int firstDay = dayOfWeek(year, month, 1);
        for(int i = 0; i<firstDay; i++){
            System.out.printf("   ");
        }

        if((year%4 == 0 &&  year%100 != 0 || year%400 == 0) && month == 2) MaxDate = MaxDateset[1] + 1;
        else MaxDate = MaxDateset[month-1];

        for(int day = 1; day <= MaxDate; day++){
            if(dayOfWeek(year, month, day) % 7 == 0){
                System.out.printf("%n%2d ", day);
            }else System.out.printf("%2d ", day);      
        }

        System.out.println();
    }
    
    // この他にも必要なメソッドがあれば追加すること
    public static void main(String[] args){
        if(args.length == 0) PrintCalendar();
        else if(args.length == 1) {
            int year = Integer.parseInt(args[0]);
            PrintCalendarYear(year);
        }
        else if(args.length == 2) {
            int year = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            PrintCalendarMonth(year, month);
        }else System.out.println("適切な引数を入力してください。");
    }
}
