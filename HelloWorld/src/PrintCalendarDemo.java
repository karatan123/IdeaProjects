import java.time.Year;
import java.util.Scanner;

/**
 * 使用方法实现日历的打印
 */
public class PrintCalendarDemo {
    /*** 用户输入的年份 全局变量*/
    public static int year = Integer.MAX_VALUE;

    /*** 用户输入的月份  全局变量*/
    public static int month = Integer.MAX_VALUE;
    /*** 对应每月的天数  全局变量*/
    private static int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args){
        PrintCalendar();

    }

    /**
     * 打印日历的核心方法
     */
    public static void PrintCalendar(){
        //让用户输入年份月份
        InputYearAndMonth();
        //计算1990-01-01到用户输入年份的总天数（year=2017，month=7，2017-7-1）
        //2.1 计算个年的总天数
        //计算个月的天数
        int sum = getSumDayOfYear();
        sum+=getSumDayOfMonth();
        sum++;
        System.out.println(sum%7);
        //打印年份和月份（英文）
        PrintMonthTitle();

        //打印月份的标题（星期一到星期日）
        //根据某月1日是星期几，打印月份的内容
        PrintCalendarContent(sum%7);


    }

    /**
     * 根据当月1号是星期几打印日历内容
     * @param dayOfWeek 当月1号是星期几
     */
    private static void PrintCalendarContent(int dayOfWeek){
       //注意：dayOfWeek取值0-6
        int sepCount = 0;//\t的数量
        if(dayOfWeek == 0) {
            sepCount = 6;
        }else{
            sepCount=dayOfWeek-1;
        }
        for(int i=0;i<sepCount;i++){
            System.out.print("\t");
        }
        for(int i=0;i< dayOfMonth[month-1];i++){
            System.out.print(i+1);
            if((dayOfWeek+i)%7 == 0){
                System.out.println();
            }else{
                System.out.print("\t");

            }

        }
    }

    private static void PrintMonthTitle(){
        String[] monthName = {"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
        System.out.println(year+ "\t" + monthName[month-1]);
        //System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
        String[] weekDays = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        for(int i=0;i<weekDays.length;i++){
            System.out.print(weekDays[i]+"\t");
        }
        System.out.println();
    }

    /**
     * 获得1900-year的总天数
     * @return
     */
    private static int getSumDayOfYear(){
        //用户是否已经输入了年份
        if(year == Integer.MAX_VALUE){
            System.out.print("年份错误，请重新输入年份和月份");
            InputYearAndMonth();
        }
        int sum = 0;
        for(int i=1990;i<year;i++){
            sum+=365;//每年累加365
            if(isLeapYear(i)){
                sum++;//闰年多加一天
            }

        }
        return sum;

    }

    /**
     * 得到year年1-1号到year年month-1月的最后一天的总天数
     */
    private static int getSumDayOfMonth(){
        int sum = 0;
        for(int i=0;i<month-1;i++){
            sum+=dayOfMonth[i];
            //如果year年是闰年，并且month>=3
            if(isLeapYear(year) && month>=3)
            {
                sum++;
            }
        }
        return sum;

    }

    /**
     * 用来判断传入的year变量是不是闰年
     *
     * @param year 要判断的年份
     * @return 是闰年，返回true
     */
    private static boolean isLeapYear(int year){
        return year % 400 == 0 || ((year % 4 == 0) && (year % 100 !=0));
    }

    private static void InputYearAndMonth(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        year = input.nextInt();
        System.out.print("请输入月份：");
        month = input.nextInt();
    }
}
