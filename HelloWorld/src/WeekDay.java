import java.util.Scanner;
public class WeekDay {
    public static void main(String[] args){
        System.out.println("请输入今天是星期几");
        int dayOfWeek=new Scanner(System.in).nextInt();
        //中文
        ShowWeekDayByChinese(dayOfWeek-1);
        //日文
        ShowWeekDayByJapanese(dayOfWeek-1);
        //英文
//        ShowWeekDayByEnglish(dayOfWeek);
    }

    /**
     * 用来判断传入的参数是否是1-7之间
     * @param dayOfWeek 要判断的整数数字，星期几
     * @return如果合法，返回true，非法，返回false
     */
    private  static boolean isRight(int dayOfWeek){
        if(dayOfWeek <0 || dayOfWeek >6){
            System.out.println("必须输入1-7之间整数");
            return false;
        }
        return true;
    }

    /**
     * 以中文的方式，打印星期几
     * @param dayOfWeek 1-7之间的整型数字，用来表示星期几
     */
    public static void ShowWeekDayByChinese(int dayOfWeek) {
//        if(dayOfWeek <1 || dayOfWeek >7){
//            System.out.println("必须输入1-7之间的数字");
//            return;
//        }
        if (isRight(dayOfWeek)) {
            String[] weekDays = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"};
            System.out.println(weekDays[dayOfWeek]);
            }
    }
    static void ShowWeekDayByJapanese(int dayOfWeek) {
//        if(dayOfWeek <1 || dayOfWeek >7){
//            System.out.println("必须输入1-7之间的数字");
//            return;
//        }
        if (isRight(dayOfWeek)) {
            String[] weekDays = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};
            System.out.println(weekDays[dayOfWeek]);
        }
    }
//    void ShowWeekDayByEnglish(int dayOfWeek){
//
//    }
}
